package Products;

public class ProductRepoImpl implements ProductRepo{
    @Override
    public String createProduct(Product p) {
        return null;
    }

    @Override
    public boolean deleteProduct(Integer id) {
        return false;
    }

    @Override
    public boolean deleteProduct(String name) {
        return false;
    }

    @Override
    public boolean updateAvailableQuantity(Integer id, Integer newQuantity) {
        return false;
    }

    @Override
    public boolean updateLocation(Integer id, String newLocation) {
        return false;
    }
}
