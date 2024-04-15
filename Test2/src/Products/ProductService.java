package Products;

import Carts.Authorised;
import Carts.Cart;
import Carts.CartItem;

import java.util.ArrayList;

public interface ProductService {
    boolean createProduct(Product p);

    boolean deleteProduct(Integer id);

    boolean deleteProduct(String name);
    boolean createCart();
    boolean createCartItem(CartItem cartItem);
    boolean deleteCartItem(String name);
    boolean productsExistsinCart(String name, int id);
    int getCartItemQuantity(String name, int id);
    boolean cartExists(int id);
    boolean authoriseCart(int id, Double total, String method);
    ArrayList<Authorised> viewAuthorised();
    boolean deleteCart(int id);
    ArrayList<CartItem> viewCartItems(int id);
    boolean cartNotEmpty(int id);
    ArrayList<Integer> viewCarts();
    boolean updateAvailableQuantity(Integer id, Integer newQuantity);
    Integer getQuantity(String name);
    Integer getQuantity(Integer id);
    ArrayList<String> getCategories();

    boolean categoryExists(String name);

    void addCategory(String name);

    ArrayList<Product> getAllProducts();

    boolean productsExists(String name);

    boolean deleteCategory(String name);

    boolean deleteCatProducts(String category);

    boolean supplierExists(Integer supplierId);

    ArrayList<Supplier> getSuppliers();

    boolean productExists(String name);

    boolean productExists(int id);
    String getProductName(int id);
    int getProductId(String name);
    Double getPrice(int id);
    Double getPrice(String name);
}
