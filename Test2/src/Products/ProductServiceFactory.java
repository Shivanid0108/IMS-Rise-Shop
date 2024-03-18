package Products;


public class ProductServiceFactory {
    public static ProductService getProductService(ProductRepo product) {
        return new ProductServiceImpl(product);
    }
}
