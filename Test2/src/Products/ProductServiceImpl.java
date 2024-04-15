package Products;

import Carts.Authorised;
import Carts.Cart;
import Carts.CartItem;

import java.util.ArrayList;

public class ProductServiceImpl implements ProductService {
    private final ProductRepo product;

    public ProductServiceImpl(ProductRepo product) {
        this.product = product;
    }
    @Override
    public boolean createProduct(Product p) {
        return product.createProduct(p);
    }
    @Override
    public boolean deleteProduct(Integer id) {
        return product.deleteProduct(id);
    }
    @Override
    public boolean deleteProduct(String name) {return product.deleteProduct(name);}

    @Override
    public boolean createCart() { return product.createCart();}
    @Override
    public boolean createCartItem(CartItem cartItem) {return product.createCartItem(cartItem);}

    @Override
    public boolean deleteCartItem(String name) {return product.deleteCartItem(name);}

    @Override
    public boolean productsExistsinCart(String name, int id) {
        return product.productExistsinCart(name,id);
    }

    @Override
    public int getCartItemQuantity(String name, int id) {
        return product.getCartItemQuantity(name, id);
    }

    @Override
    public boolean cartExists(int id) {
        return product.cartExists(id);
    }

    @Override
    public boolean authoriseCart(int id, Double total, String method) {
        return product.authoriseCart(id, total, method);
    }

    @Override
    public ArrayList<Authorised> viewAuthorised() {
        return product.viewAuthorised();
    }

    @Override
    public boolean deleteCart(int id) {return product.deleteCart(id);}

    @Override
    public ArrayList<CartItem> viewCartItems(int id) {return product.viewCartItems(id);}

    @Override
    public boolean cartNotEmpty(int id) {
        return product.cartNotEmpty(id);
    }

    @Override
    public ArrayList<Integer> viewCarts() {return product.viewCarts();}

    @Override
    public boolean updateAvailableQuantity(Integer id, Integer newQuantity) {
        return false;
    }

    @Override
    public Integer getQuantity(String name) {
        return product.getQuantity(name);
    }

    @Override
    public Integer getQuantity(Integer id) {
        return product.getQuantity(id);
    }

    @Override
    public ArrayList<String> getCategories() {
        return product.getCategories();
    }

    @Override
    public boolean categoryExists(String name) {
        return product.categoryExists(name);
    }

    @Override
    public void addCategory(String name) {
        product.addCategory(name);
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        return product.getAllProducts();
    }

    @Override
    public boolean productsExists(String name) {
        return product.productsExists(name);
    }

    @Override
    public boolean deleteCategory(String name) {
        return product.deleteCategory(name);
    }

    @Override
    public boolean deleteCatProducts(String category) {
        return product.deleteCatProducts(category);
    }

    @Override
    public boolean supplierExists(Integer supplierId) {
        return product.supplierExists(supplierId);
    }

    @Override
    public ArrayList<Supplier> getSuppliers() {
        return product.getSuppliers();
    }

    @Override
    public boolean productExists(String name) {
        return product.productExists(name);
    }

    @Override
    public boolean productExists(int id) {
        return product.productExists(id);
    }

    @Override
    public String getProductName(int id) {
        return product.getProductName(id);
    }

    @Override
    public int getProductId(String name) {
        return product.getProductId(name);
    }

    @Override
    public Double getPrice(int id) {
        return product.getPrice(id);
    }

    @Override
    public Double getPrice(String name) {
        return product.getPrice(name);
    }
}
