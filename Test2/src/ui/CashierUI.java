package ui;

import Products.ProductService;
import Users.UserService;
import Utils.PrintUtil;
import Utils.Utility;

public class CashierUI {
    private static final String[] CashierMenu = new String[]{"Cashier Menu", "Account", "Create Cart", "View/Delete Carts", "View Authorized Payments", "Show Events", "SignOut",};//TODO
    private static final String[] CartMenu = new String[]{"Add product by id", "Add product by name", "Checkout Cart", "Go Back"};
    private final String currentUser;
    private final UserService userService;
    private final ProductService productService;
    private final Callback callback;

    public CashierUI(UserService userService, ProductService productService, String currentUser, Callback callback) {
        this.currentUser = currentUser;
        this.productService = productService;
        this.userService = userService;
        this.callback = callback;
    }

    public void showCashierMenu() {//"Account", "Create Cart", "View/Delete Carts", "View Authorized Payments", "Show Events", "SignOut",};//TODO
        boolean loopVar = true;
        while (loopVar) {
            final int c = Utility.printMenuAndGetValidInput(CashierMenu);
            switch (c) {
                case 1 -> {
                    new AccountsUI(userService, currentUser, callback).showAccountMenu();
                    loopVar = false;
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                    PrintUtil.signedOut();
                    callback.removeCurrentUserExit();
                    loopVar = false;
                }
                default -> PrintUtil.invalidChoice();
            }
        }
    }//TODO extend
}
