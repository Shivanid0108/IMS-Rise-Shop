package Products;

import Users.UserRepository;

public class ProductServiceImpl implements ProductService{
    private final ProductRepo product;
    public ProductServiceImpl(ProductRepo product) {
        this.product = product;
    }

    @Override
    public String createProduct(String name, Integer id, Integer quantityAvailable, Double price, String location, Supplier supplier) {
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
