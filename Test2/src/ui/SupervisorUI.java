package ui;


import Products.Product;
import Products.ProductService;
import Products.Supplier;
import Users.User;
import Users.UserService;
import Utils.PrintUtil;
import Utils.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class SupervisorUI {
    private static final String[] SupervisorMenu = new String[]{"Supervisor Menu", "Account", "Modify TeamLeaders", "View Notifications", "Modify Products", "View All Suppliers", "View Authorized Payments", "Show Events", "SignOut",};
    private static final String[] ModifyTLMenu = new String[]{"Modify Team-Leader Menu", "View Employed Team-Leaders", "Employ a Team-Leader", "Fire a Team-Leader", "Go Back"};
    private static final String[] ModifyProductMenu = new String[]{"Modify Products Menu", "View existing Products", "Add Product", "Delete Product by name", "Delete Product by id", "Go Back"};
    private final String currentUser;
    private final UserService userService;
    private final ProductService productService;
    private final Callback callback;
    static final Scanner sc = new Scanner(System.in);

    public SupervisorUI(UserService userService, ProductService productService, String currentUser, Callback callback) {
        this.currentUser = currentUser;
        this.productService = productService;
        this.userService = userService;
        this.callback = callback;
    }

    public void showSupervisorMenu() {
        boolean loopVar = true;
        while (loopVar) {
            final int c = Utility.printMenuAndGetValidInput(SupervisorMenu);
            switch (c) {
                case 1 -> {
                    new AccountsUI(userService, currentUser, callback).showAccountMenu();
                    loopVar = false;
                }
                case 2 -> {
                    boolean loopVar1 = true;
                    while (loopVar1) {
                        final int d = Utility.printMenuAndGetValidInput(ModifyTLMenu);
                        switch (d) {
                            case 1 -> {viewTLs();}
                            case 2 -> {addTL();}
                            case 3 -> {deleteTL();}
                            case 4 -> {loopVar1 = false;}
                            default -> PrintUtil.invalidChoice();
                        }
                    }
                }
                case 3 -> {viewNotifications();}
                case 4 -> {
                    boolean loopVar1 = true;
                    while (loopVar1) {
                        final int d = Utility.printMenuAndGetValidInput(ModifyProductMenu);
                        switch (d) {
                            case 1 -> {viewAllProducts();}
                            case 2 -> {addProduct();}
                            case 3 -> {deleteProductName();}
                            case 4 -> {deleteProductId();}
                            case 5 -> {loopVar1 = false;}
                            default -> PrintUtil.invalidChoice();
                        }
                    }
                }
                case 5 -> {viewAllSuppliers();}
                case 6 -> {viewAuthorisedPayments();}
                case 7 -> {PrintUtil.printEvents();}
                case 8 -> {
                    PrintUtil.signedOut();
                    callback.removeCurrentUserExit();
                    loopVar = false;
                }
                default -> PrintUtil.invalidChoice();
            }
        }
    }
    private void viewNotifications(){
        //TODO Notifs
    }
    private void viewAuthorisedPayments() {
        //TODO payments
    }
    private void viewAllSuppliers(){
        ArrayList<Supplier> suppliers = productService.getSuppliers();
        Utility.printSuppliers(suppliers);
    }
    private void deleteProductName(){
        PrintUtil.askName();
        String name = sc.nextLine();
        if(productService.productExists(name)){
            if(productService.deleteProduct(name)){
                System.out.println("\nProduct Deleted Successfully");
            }
            else {System.out.println("\nProduct could not be deleted");}
        }else {System.out.println("The product with name: "+name+" does not exists.");}
    }
    private void deleteProductId(){
        PrintUtil.askId();
        int id = Integer.parseInt(sc.nextLine());
        if(productService.productExists(id)){
            if(productService.deleteProduct(id)){
                System.out.println("\nProduct Deleted Successfully");
            }
            else {System.out.println("\nProduct could not be deleted");}
        }else {System.out.println("The product with id: "+id+" does not exists.");}
    }
    private void addProduct(){
        ArrayList<String> categories = productService.getCategories();
        System.out.println("\nList of Categories:");
        PrintUtil.printStringList(categories);
        System.out.println("\nEnter the category of product from the above list: ");
        String category = sc.nextLine();
        while (!productService.categoryExists(category)){
            PrintUtil.invalidCategory();
            category = sc.nextLine();
        }
        viewAllSuppliers();
        PrintUtil.askSupplierId();
        int supplier_id = Integer.parseInt(sc.nextLine());
        while (!productService.supplierExists(supplier_id)){
            PrintUtil.invalidSupplier();
            supplier_id = Integer.parseInt(sc.nextLine());
        }
        PrintUtil.askName();final String name = sc.nextLine();
        PrintUtil.askQuantity();final int quantity = Integer.parseInt(sc.nextLine());
        PrintUtil.askPrice();final Double price = Double.parseDouble(sc.nextLine());
        PrintUtil.askDescription();final String desc = sc.nextLine();
        PrintUtil.asklocation();final String location = sc.nextLine();
        Product prod = new Product(name, quantity, price);
        prod.setLocation(location);
        prod.setCategory(category);
        prod.setSupplier_id(supplier_id);
        prod.setDescription(desc);
        if(productService.createProduct(prod)){
            System.out.println("Product added Successfully.");
        }
        else {System.out.println("Product could not be added.");}
    }
    private void viewAllProducts() {
        ArrayList<Product> products = productService.getAllProducts();
        System.out.println("\nList of All products:");
        PrintUtil.printProducts(products);
    }
    private void viewTLs() {
        ArrayList<User> tls = userService.viewRoleUsers("TeamLeader");
        System.out.println("\nList of current TeamLeaders:");
        PrintUtil.printUsers(tls);
    }

    private void addTL() {
        String role = "TeamLeader";
        PrintUtil.askName();
        final String name = sc.nextLine();
        PrintUtil.askUsername();
        String username = sc.nextLine();
        while (Utility.isNotValidUsername(username)) {
            PrintUtil.notValidUsername();
            username = sc.nextLine();
        }
        while (userService.checkUser(username)) {
            PrintUtil.existUser();
            username = sc.nextLine();
        }
        PrintUtil.askPass();
        String pass = sc.nextLine();
        while (!Utility.isValidPass(pass)) {
            PrintUtil.notValidPass();
            pass = sc.nextLine();
        }
        PrintUtil.askDob();
        String dob = sc.nextLine();
        while (!Utility.isValidDate(dob)) {
            PrintUtil.notValidDob();
            dob = sc.nextLine();
        }
        PrintUtil.askBio();
        final String bio = sc.nextLine();
        PrintUtil.askSalary();
        final Double salary = Double.parseDouble(sc.nextLine());
        String user = userService.createUser(name, username, pass, dob, bio, role, salary);
        PrintUtil.createdUser(user);
        System.out.print("\nUser Details:\n" + name + " | " + username + " | " + dob + " | " + bio + " | " + salary + " | " + role);
    }

    private void deleteTL() {
        viewTLs();
        System.out.print("\nEnter the username to Fire : ");
        String username = sc.nextLine();
        while (Utility.isNotValidUsername(username)) {
            PrintUtil.notValidUsername();
            username = sc.nextLine();
        }
        if (!userService.checkUser(username, "TeamLeader")) {
            PrintUtil.userNotExistNotSupervisor();
            return;
        }
        if (userService.deleteUser(username)) {
            System.out.print("\nUser removed successfully");
        } else {
            System.out.print("\nCouldn't remove user");
        }
    }
}
