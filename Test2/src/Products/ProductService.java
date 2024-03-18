package Products;

public interface ProductService {
    String createProduct(String name, Integer id, Integer quantityAvailable, Double price, String location, Supplier supplier);
    boolean deleteProduct(Integer id);
    boolean deleteProduct(String name);
    boolean updateAvailableQuantity(Integer id, Integer newQuantity);
    boolean updateLocation(Integer id, String newLocation);
}
