package Products;

import Carts.Authorised;
import Carts.CartItem;
import Utils.DatabaseUtils;

import java.sql.*;
import java.util.ArrayList;

public class ProductRepoImpl implements ProductRepo {
    private static final String view_categories = "Select category from categories;";
    private static final String view_AllProducts = "Select * from products;";
    private static final String view_Suppliers = "Select * from suppliers;";
    private static final String check_category = "Select category from categories where category = \"%s\";";
    private static final String check_supplier = "Select id from suppliers where id = \"%s\";";
    private static final String check_categoryProducts = "Select category from products where category = \"%s\";";
    private static final String add_category = "INSERT into categories" + "(category) VALUES" + " (?);";
    private static final String delete_category = "DELETE from categories where category = \"%s\";";
    private static final String delete_categoryProducts = "DELETE from products where category = \"%s\";";
    private static final String add_product = "INSERT into products" + "(name,category,desc,location,supplier_id,price,quantity) VALUES" + " (?,?,?,?,?,?,?);";
    private static final String check_productName = "Select name from products where name = \"%s\";";
    private static final String check_productId = "Select id from products where id = \"%s\";";
    private static final String delete_productName = "DELETE from products where name = \"%s\";";
    private static final String delete_productId = "DELETE from products where id = \"%s\";";
    private static final String update_quantity = "UPDATE products set quantity = \"%s\" where id = \"%s\";";
    private static final String get_quantityName = "SELECT quantity from products where name = \"%s\";";
    private static final String get_quantityId = "SELECT quantity from products where id = \"%s\";";
    private static final String createCart = "INSERT into carts VALUES(NULL);";
    private static final String createCartItem = "INSERT into cartItems VALUES" + " (?,?,?,?,?);";
    private static final String deleteCartItem = "DELETE from cartItems where name = \"%s\";";
    private static final String deleteCart = "DELETE from carts where id = \"%s\";";
    private static final String viewCartItems = "SELECT * FROM cartItems where id = \"%s\";";
    private static final String viewCarts = "SELECT id FROM carts;";
    private static final String viewPriceName = "SELECT price FROM products where name = \"%s\";";
    private static final String viewPriceId = "SELECT price FROM products where id = \"%s\";";
    private static final String viewProductId = "SELECT id from products where name = \"%s\";";
    private static final String viewProductName = "SELECT name from products where id = \"%s\";";
    private static final String check_productNameCart = "Select name from cartItems where name = \"%s\" and id = \"%s\";";
    private static final String view_cartItemQuantity = "SELECT quantity FROM cartItems where name = \"%s\" and id = \"%s\";";
    private static final String check_cartExists = "SELECT id from carts where id = \"%s\";";
    private static final String check_cartNotEmpty = "SELECT * from cartItems where id = \"%s\";";
    private static final String update_cartQuantity = "UPDATE cartItems set quantity = \"%s\" where id = \"%s\" and name = \"%s\";";
    private static final String authorise_Cart = "INSERT into authorised VALUES (?,?,?);";
    private static final String view_Authorised = "SELECT * FROM authorised;";
    private static final String update_cartTotal = "UPDATE cartItems set totalPrice = (SELECT price from cartItems where id = \"%s\" and name = \"%s\") * (SELECT quantity from cartItems where id = \"%s\" and name = \"%s\");";
    private static final Connection connection = DatabaseUtils.getConnection();

    public ProductRepoImpl() throws SQLException {
        connection.createStatement().execute("CREATE TABLE IF NOT EXISTS categories(category text PRIMARY KEY UNIQUE NOT NULL)");
        connection.createStatement().execute("CREATE TABLE IF NOT EXISTS suppliers(name text UNIQUE NOT NULL,id INTEGER PRIMARY KEY AUTOINCREMENT,contact text)");
        connection.createStatement().execute("CREATE TABLE IF NOT EXISTS products(name text,quantity INTEGER,price REAL,category text NOT NULL,desc text,id INTEGER PRIMARY KEY AUTOINCREMENT,location text,supplier_id NOT NULL,FOREIGN KEY (category) REFERENCES categories (category),FOREIGN KEY (supplier_id) REFERENCES suppliers (id) );");
        connection.createStatement().execute("CREATE TABLE IF NOT EXISTS carts(id INTEGER PRIMARY KEY AUTOINCREMENT);");
        connection.createStatement().execute("CREATE TABLE IF NOT EXISTS cartItems(id INTEGER ,name text PRIMARY KEY, quantity INTEGER, price REAL, totalPrice INTEGER, FOREIGN KEY (name) REFERENCES products(name), FOREIGN KEY (id) REFERENCES carts(id));");
        connection.createStatement().execute("CREATE TABLE IF NOT EXISTS authorised(id INTEGER PRIMARY KEY, totalPrice REAL, method TEXT);");
    }

    @Override
    public boolean createProduct(Product p) {
        try (PreparedStatement pst = connection.prepareStatement(add_product)) {
            pst.setString(1, p.getName());
            pst.setString(2, p.getCategory());
            pst.setString(3, p.getDescription());
            pst.setString(4, p.getLocation());
            pst.setInt(5, p.getSupplier_id());
            pst.setDouble(6, p.getPrice());
            pst.setInt(7, p.getQuantityAvailable());
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.print("\n " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteProduct(Integer id){
        try (Statement st = connection.createStatement()) {
            st.executeUpdate(String.format(delete_productId, id));
            return true;
        } catch (SQLException e) {
            System.out.print("\n " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteProduct(String name) {
        try (Statement st = connection.createStatement()) {
            st.executeUpdate(String.format(delete_productName, name));
            return true;
        } catch (SQLException e) {
            System.out.print("\n " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean createCart() {
        try (Statement st = connection.createStatement()) {
            st.executeUpdate(String.format(createCart));
            return true;
        } catch (SQLException e) {
            System.out.print("\n " + e.getMessage());
        }
        return false;
    }
    @Override
    public void updateCartTotal(String name, int id){
        try (Statement st = connection.createStatement()) {
            st.executeUpdate(String.format(update_cartTotal,id,name,id,name));
        } catch (SQLException e) {
            System.out.print("\n " + e.getMessage());
        }
    }
    @Override
    public void updateCartQuantity(String name, int id, int quantity){
        try (Statement st = connection.createStatement()) {
            st.executeUpdate(String.format(update_cartQuantity,quantity,id,name));
        } catch (SQLException e) {
            System.out.print("\n " + e.getMessage());
        }
    }
    @Override
    public boolean createCartItem(CartItem c) {//(id INTEGER PRIMARY KEY,name text, quantity INTEGER, price REAL, totalPrice INTEGER
        if(productExistsinCart(c.getName(), c.getId())){
            updateCartQuantity(c.getName(),c.getId(),getCartItemQuantity(c.getName(),c.getId())+c.getQuantity());
            updateCartTotal(c.getName(),c.getId());
            return true;
        }else{
            try (PreparedStatement pst = connection.prepareStatement(createCartItem)) {
                pst.setInt(1, c.getId());
                pst.setString(2, c.getName());
                pst.setInt(3, c.getQuantity());
                pst.setDouble(4, c.getPrice());
                pst.setDouble(5, c.getTotalPrice());
                pst.executeUpdate();
                return true;
            } catch (SQLException e) {
                System.out.print("\n " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean deleteCartItem(String name) {
        try (Statement st = connection.createStatement()) {
            st.executeUpdate(String.format(deleteCartItem, name));
            return true;
        } catch (SQLException e) {
            System.out.print("\n " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean productExistsinCart(String name, int id) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(check_productNameCart, name, id));
            if (rs.next() && rs.getString("name").equals(name)) {
                return true;
            }
        } catch (SQLException e) {
            System.out.print("\n6 " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean authoriseCart(int id, Double total, String method) {//id, price, method
        try (PreparedStatement pst = connection.prepareStatement(authorise_Cart)) {
            pst.setInt(1, id);
            pst.setDouble(2, total);
            pst.setString(3, method);
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.print("\n " + e.getMessage());
        }
        return false;
    }

    @Override
    public ArrayList<Authorised> viewAuthorised() {
        ArrayList<Authorised> list = new ArrayList<>();
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(view_Authorised);
            while (rs.next()) {
                Authorised a = new Authorised(rs.getInt("id"),rs.getDouble("totalPrice"),rs.getString("method"));
                list.add(a);
            }
            return list;
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return null;
    }

    @Override
    public boolean cartExists(int id) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(check_cartExists, id));
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.print("\n6 " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean cartNotEmpty(int id) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(check_cartNotEmpty, id));
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.print("\n6 " + e.getMessage());
        }
        return false;
    }

    @Override
    public int getCartItemQuantity(String name,int id) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(view_cartItemQuantity, name, id));
            if (rs.next()) {
                return rs.getInt("quantity");
            }
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return 0;
    }

    @Override
    public boolean deleteCart(int id) {
        try (Statement st = connection.createStatement()) {
            st.executeUpdate(String.format(deleteCart, id));
            return true;
        } catch (SQLException e) {
            System.out.print("\n " + e.getMessage());
        }
        return false;
    }

    @Override
    public Double getPrice(int id) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(viewPriceId,id));
            if (rs.next()) {
                return rs.getDouble("price");
            }
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return null;
    }

    @Override
    public Double getPrice(String name) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(viewPriceName,name));
            if (rs.next()) {
                return rs.getDouble("price");
            }
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return null;
    }

    @Override
    public String getProductName(int id) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(viewProductName,id));
            if (rs.next()) {
                return rs.getString("name");
            }
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return null;
    }

    @Override
    public int getProductId(String name) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(viewProductId,name));
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return 0;
    }

    @Override
    public ArrayList<Integer> viewCarts() {
        ArrayList<Integer> carts = new ArrayList<>();
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(viewCarts);
            while (rs.next()) {
                carts.add(rs.getInt("id"));
            }
            return carts;
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return null;
    }

    @Override
    public ArrayList<CartItem> viewCartItems(int id) {
        ArrayList<CartItem> cart = new ArrayList<>();
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(viewCartItems,id));
            while (rs.next()) {
                CartItem s = new CartItem(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setPrice(rs.getDouble("price"));
                s.setTotalPrice();
                s.setQuantity(rs.getInt("quantity"));
                cart.add(s);
            }
            return cart;
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return cart;
    }

    @Override
    public boolean updateAvailableQuantity(Integer id, Integer newQuantity) {
        try (Statement st = connection.createStatement()) {
            st.executeUpdate(String.format(update_quantity, newQuantity, id));
            return true;
        } catch (SQLException e) {
            System.out.print("\n " + e.getMessage());
        }
        return false;
    }
    @Override
    public ArrayList<String> getCategories() {
        ArrayList<String> categories = new ArrayList<>();
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(view_categories);
            while (rs.next()) {
                categories.add(rs.getString("category"));
            }
            return categories;
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return null;
    }

    @Override
    public boolean categoryExists(String name) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(check_category, name));
            if (rs.next() && rs.getString("category").equals(name)) {
                return true;
            }
        } catch (SQLException e) {
            System.out.print("\n6 " + e.getMessage());
        }
        return false;
    }

    @Override
    public void addCategory(String name) {
        try (PreparedStatement pst = connection.prepareStatement(add_category)) {
            pst.setString(1, name);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.print("\n" + e.getMessage());
        }
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> products = new ArrayList<>();
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(view_AllProducts);
            while (rs.next()) {
                Product prod = new Product(rs.getString("name"), rs.getInt("quantity"), rs.getDouble("price"));
                prod.setCategory(rs.getString("category"));
                prod.setId(rs.getInt("id"));
                prod.setDescription(rs.getString("desc"));
                prod.setLocation(rs.getString("location"));
                prod.setSupplier_id(rs.getInt("supplier_id"));
                products.add(prod);
            }
            return products;
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return null;
    }

    @Override
    public boolean productsExists(String name) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(check_categoryProducts, name));
            if (rs.next() && rs.getString("category").equals(name)) {
                return true;
            }
        } catch (SQLException e) {
            System.out.print("\n6 " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean deleteCategory(String name) {
        try (Statement st = connection.createStatement()) {
            st.executeUpdate(String.format(delete_category, name));
            return true;
        } catch (SQLException e) {
            System.out.print("\n " + e.getMessage());
        }
        return false;
    }
    @Override
    public boolean deleteCatProducts(String category) {
        try (Statement st = connection.createStatement()) {
            st.executeUpdate(String.format(delete_categoryProducts, category));
            return true;
        } catch (SQLException e) {
            System.out.print("\n " + e.getMessage());
        }
        return false;
    }
    @Override
    public ArrayList<Supplier> getSuppliers() {
        ArrayList<Supplier> suppliers = new ArrayList<>();
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(view_Suppliers);
            while (rs.next()) {
                Supplier s = new Supplier(rs.getString("name"));
                s.setId(rs.getInt("id"));
                s.setContactInfo(rs.getString("contact"));
                suppliers.add(s);
            }
            return suppliers;
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return null;
    }

    @Override
    public boolean supplierExists(Integer supplierId) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(check_supplier, supplierId));
            if (rs.next() && rs.getInt("id")==supplierId) {
                return true;
            }
        } catch (SQLException e) {
            System.out.print("\n6 " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean productExists(String name) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(check_productName, name));
            if (rs.next() && rs.getString("name").equals(name)) {
                return true;
            }
        } catch (SQLException e) {
            System.out.print("\n6 " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean productExists(int id) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(check_productId, id));
            if (rs.next() && rs.getInt("id")==id) {
                return true;
            }
        } catch (SQLException e) {
            System.out.print("\n6 " + e.getMessage());
        }
        return false;
    }

    @Override
    public Integer getQuantity(String name) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(get_quantityName,name));
            if (rs.next()) {
                return rs.getInt("quantity");
            }
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return null;
    }

    @Override
    public Integer getQuantity(Integer id) {
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(String.format(get_quantityId,id));
            if (rs.next()) {
                return rs.getInt("quantity");
            }
        } catch (SQLException | NullPointerException e) {
            System.out.print("\n" + e.getMessage());
        }
        return 0;
    }
}
