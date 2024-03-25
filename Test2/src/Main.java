import Products.ProductRepoImpl;
import Products.ProductService;
import Products.ProductServiceFactory;
import Users.UserRepositoryImplementation;
import Users.UserService;
import Users.UserServiceFactory;
import Utils.PrintUtil;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            UserService userService = UserServiceFactory.getUserService(new UserRepositoryImplementation());
            ProductService productService = ProductServiceFactory.getProductService(new ProductRepoImpl());
            App app = new App(userService, productService);
            PrintUtil.welcomeText();
            app.start();
        } catch (SQLException e) {
            System.out.print("\nInitialisation error");
            e.printStackTrace();
        }
    }
}