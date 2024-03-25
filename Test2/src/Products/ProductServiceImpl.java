package Products;

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
}
