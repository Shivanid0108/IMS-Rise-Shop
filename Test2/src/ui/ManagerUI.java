package ui;

import Products.Product;
import Products.ProductService;
import Users.User;
import Users.UserService;
import Utils.PrintUtil;
import Utils.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerUI {
    static final Scanner sc = new Scanner(System.in);
    private static final String[] ManagerMenu = new String[]{"Manager Menu", "Account", "Modify Supervisors", "View Notifications", "Modify Categories", "View All Products", "Show Events", "SignOut",};
    private static final String[] ModifySupervisorMenu = new String[]{"Modify Supervisor Menu", "View Employed Supervisors", "Employ a Supervisor", "Fire a Supervisor", "Go Back"};
    private static final String[] ModifyCategoryMenu = new String[]{"Modify Categories Menu", "View existing Categories", "Add Category", "Delete Category", "Go Back"};
    private final String currentUser;
    private final UserService userService;
    private final ProductService productService;
    private final Callback callback;

    public ManagerUI(UserService userService, ProductService productService, String currentUser, Callback callback) {
        this.currentUser = currentUser;
        this.userService = userService;
        this.productService = productService;
        this.callback = callback;
    }

    public void showManagerMenu() {
        boolean loopVar = true;
        while (loopVar) {
            final int c = Utility.printMenuAndGetValidInput(ManagerMenu);
            switch (c) {
                case 1 -> {
                    new AccountsUI(userService, currentUser, callback).showAccountMenu();
                    loopVar = false;
                }
                case 2 -> {
                    boolean loopVar1 = true;
                    while (loopVar1) {
                        final int d = Utility.printMenuAndGetValidInput(ModifySupervisorMenu);
                        switch (d) {
                            case 1 -> {
                                viewSupervisors();
                            }
                            case 2 -> {
                                addSupervisor();
                            }
                            case 3 -> {
                                deleteSupervisor();
                            }
                            case 4 -> {
                                loopVar1 = false;
                            }
                            default -> PrintUtil.invalidChoice();
                        }
                    }
                }
                case 3 -> {
                    viewNotifications();
                }
                case 4 -> {
                    boolean loopVar1 = true;
                    while (loopVar1) {
                        final int d = Utility.printMenuAndGetValidInput(ModifyCategoryMenu);
                        switch (d) {
                            case 1 -> {
                                viewCategories();
                            }
                            case 2 -> {
                                addCategory();
                            }
                            case 3 -> {
                                safedeleteCategory();
                            }
                            case 4 -> {
                                loopVar1 = false;
                            }
                            default -> PrintUtil.invalidChoice();
                        }
                    }
                }
                case 5 -> {
                    viewAllProducts();
                }
                case 6 -> {
                    PrintUtil.printEvents();
                }
                case 7 -> {
                    PrintUtil.signedOut();
                    callback.removeCurrentUserExit();
                    loopVar = false;
                }
                default -> PrintUtil.invalidChoice();
            }
        }
    }

    private void viewNotifications() {
        //TODO Notifs
    }

    private void viewAllProducts() {
        ArrayList<Product> products = productService.getAllProducts();
        System.out.println("\nList of All products:");
        PrintUtil.printProducts(products);
    }

    private void viewCategories() {
        ArrayList<String> categories = productService.getCategories();
        System.out.println("\nList of Categories:");
        PrintUtil.printStringList(categories);
    }

    private void addCategory() {
        PrintUtil.askCategoryName();
        String name = sc.nextLine();
        if (productService.categoryExists(name)) {
            PrintUtil.CategoryExists();
        } else {
            productService.addCategory(name);
        }
    }

    private void safedeleteCategory() {
        PrintUtil.askCategoryName();
        String name = sc.nextLine();
        if (productService.categoryExists(name)) {
            if (productService.productsExists(name)) {
                System.out.println("\nThere are products exisitng with this category. Do you want to delete all Products. Enter Y/N :");
                String c = sc.next();
                if (c.equals("Y") || c.equals("y")) {
                    deleteCatProducts(name);
                    deleteCategory(name);
                } else if (c.equals("N") || c.equals("n")) {
                    return;
                } else {
                    PrintUtil.invalidChoice();
                }
            } else {
                deleteCategory(name);
            }
        } else {
            System.out.println("\nThe category entered does not exist.");
        }
    }

    private void deleteCatProducts(String category) {
        if (productService.deleteCatProducts(category)) {
            System.out.println("\nAll Products with the category: " + category + " are deleted Successfully.");
        } else {
            System.out.println("\nCould not delete all products with the category: " + category);
        }
    }

    private void deleteCategory(String name) {
        if (productService.deleteCategory(name)) {
            System.out.println("\nCategory Deleted Successfully.");
        } else {
            System.out.println("\nCould not delete Category.");
        }
    }

    private void viewSupervisors() {
        ArrayList<User> supervisors = userService.viewRoleUsers("Supervisor");
        System.out.println("\nList of current Supervisors:");
        PrintUtil.printUsers(supervisors);
    }

    private void addSupervisor() {
        String role = "Supervisor";
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

    private void deleteSupervisor() {
        viewSupervisors();
        System.out.print("\nEnter the username to Fire : ");
        String username = sc.nextLine();
        while (Utility.isNotValidUsername(username)) {
            PrintUtil.notValidUsername();
            username = sc.nextLine();
        }
        if (!userService.checkUser(username, "Supervisor")) {
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
