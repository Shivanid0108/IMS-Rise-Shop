package Products;

import java.util.ArrayList;

public interface ProductService {
    boolean createProduct(Product p);

    boolean deleteProduct(Integer id);

    boolean deleteProduct(String name);

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
}
