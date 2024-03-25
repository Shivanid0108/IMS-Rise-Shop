package ui;

import Products.Product;
import Products.ProductService;
import Users.User;
import Users.UserService;
import Utils.PrintUtil;
import Utils.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamLeaderUI {
    private static final String[] TLMenu = new String[]{"TeamLeader Menu", "Account", "Modify Cashiers", "View Notifications", "View All Products", "Show Events", "SignOut",};
    private static final String[] ModifyCashierMenu = new String[]{"Modify Team-Leader Menu", "View Employed Team-Leaders", "Employ a Team-Leader", "Fire a Team-Leader", "Go Back"};
    private final String currentUser;
    private final UserService userService;
    private final ProductService productService;
    private final Callback callback;
    static final Scanner sc = new Scanner(System.in);

    public TeamLeaderUI(UserService userService, ProductService productService, String currentUser, Callback callback) {
        this.currentUser = currentUser;
        this.userService = userService;
        this.productService = productService;
        this.callback = callback;
    }

    public void showTLMenu() {
        boolean loopVar = true;
        while (loopVar) {
            final int c = Utility.printMenuAndGetValidInput(TLMenu);
            switch (c) {
                case 1 -> {
                    new AccountsUI(userService, currentUser, callback).showAccountMenu();
                    loopVar = false;
                }
                case 2 -> {
                    boolean loopVar1 = true;
                    while (loopVar1) {
                        final int d = Utility.printMenuAndGetValidInput(ModifyCashierMenu);
                        switch (d) {
                            case 1 -> {viewCashiers();}
                            case 2 -> {addCashier();}
                            case 3 -> {deleteCashier();}
                            case 4 -> {loopVar1 = false;}
                            default -> PrintUtil.invalidChoice();
                        }
                    }
                }
                case 3 -> {viewNotifications();}
                case 4 -> {viewAllProducts();}
                case 5 -> {PrintUtil.printEvents();}
                case 6 -> {
                    PrintUtil.signedOut();
                    callback.removeCurrentUserExit();
                    loopVar = false;
                }
                default -> PrintUtil.invalidChoice();
            }
        }
    }
    private void viewNotifications(){
        //TODO notifs
    }
    private void viewAllProducts() {
        ArrayList<Product> products = productService.getAllProducts();
        System.out.println("\nList of All products:");
        PrintUtil.printProducts(products);
    }
    private void viewCashiers() {
        ArrayList<User> tls = userService.viewRoleUsers("Cashier");
        System.out.println("\nList of current Cashiers:");
        PrintUtil.printUsers(tls);
    }
    private void addCashier() {
        String role = "Cashier";
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

    private void deleteCashier() {
        viewCashiers();
        System.out.print("\nEnter the username to Fire : ");
        String username = sc.nextLine();
        while (Utility.isNotValidUsername(username)) {
            PrintUtil.notValidUsername();
            username = sc.nextLine();
        }
        if (!userService.checkUser(username, "Cashier")) {
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
