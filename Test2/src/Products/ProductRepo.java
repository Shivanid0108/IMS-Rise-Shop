package Products;

import Carts.Authorised;
import Carts.CartItem;

import java.util.ArrayList;

public interface ProductRepo {
    boolean createProduct(Product p);

    boolean deleteProduct(Integer id);

    boolean deleteProduct(String name);
    boolean createCart();
    boolean createCartItem(CartItem cartItem);
    boolean deleteCartItem(String name);
    boolean productExistsinCart(String name, int id);
    boolean authoriseCart(int id, Double total, String method);
    ArrayList<Authorised> viewAuthorised();
    boolean cartExists(int id);
    boolean cartNotEmpty(int id);
    int getCartItemQuantity(String name, int id);
    boolean deleteCart(int id);
    Double getPrice(int id);
    Double getPrice(String name);
    String getProductName(int id);
    int getProductId(String name);
    ArrayList<Integer> viewCarts();
    ArrayList<CartItem> viewCartItems(int id);
    public void updateCartTotal(String name, int id);
    public void updateCartQuantity(String name, int id, int quantity);

    boolean updateAvailableQuantity(Integer id, Integer newQuantity);
    ArrayList<String> getCategories();

    boolean categoryExists(String name);

    void addCategory(String name);

    ArrayList<Product> getAllProducts();

    boolean productsExists(String name);

    boolean deleteCategory(String name);

    boolean deleteCatProducts(String category);

    ArrayList<Supplier> getSuppliers();

    boolean supplierExists(Integer supplierId);

    boolean productExists(String name);

    boolean productExists(int id);

    Integer getQuantity(String name);

    Integer getQuantity(Integer id);
}
