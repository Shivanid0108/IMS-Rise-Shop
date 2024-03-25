package Products;

import java.util.ArrayList;

public interface ProductRepo {
    boolean createProduct(Product p);

    boolean deleteProduct(Integer id);

    boolean deleteProduct(String name);

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
