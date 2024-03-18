package Products;

public interface ProductRepo {
    String createProduct(Product p);
    boolean deleteProduct(Integer id);
    boolean deleteProduct(String name);
    boolean updateAvailableQuantity(Integer id, Integer newQuantity);
    boolean updateLocation(Integer id, String newLocation);
}
