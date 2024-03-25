package Products;

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
    private static final Connection connection = DatabaseUtils.getConnection();

    public ProductRepoImpl() throws SQLException {
        connection.createStatement().execute("CREATE TABLE IF NOT EXISTS categories(category text PRIMARY KEY UNIQUE NOT NULL)");
        connection.createStatement().execute("CREATE TABLE IF NOT EXISTS suppliers(name text UNIQUE NOT NULL,id INTEGER PRIMARY KEY AUTOINCREMENT,contact text)");
        connection.createStatement().execute("CREATE TABLE IF NOT EXISTS products(name text,quantity INTEGER,price REAL,category text NOT NULL,desc text,id INTEGER PRIMARY KEY AUTOINCREMENT,location text,supplier_id NOT NULL,FOREIGN KEY (category) REFERENCES categories (category),FOREIGN KEY (supplier_id) REFERENCES suppliers (id) );");
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
        return null;
    }
}
