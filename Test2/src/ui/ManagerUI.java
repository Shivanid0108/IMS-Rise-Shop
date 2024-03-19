package ui;

import Users.UserService;
import Utils.PrintUtil;
import Utils.Utility;

public class ManagerUI {
    private static final String[] ManagerMenu = new String[]{"Manager Menu", "Account", "Modify Supervisors", "View Notifications", "Modify Categories", "View All Products", "Show Events", "SignOut",};//TODO
    private static final String[] ModifySupervisorMenu = new String[]{"Modify Supervisor Menu", "View Employed Supervisors", "Employ a Supervisor", "Fire a Supervisor", "Go Back"};
    private static final String[] ModifyCategoryMenu = new String[]{"Modify Categories Menu", "View existing Categories", "Add Category", "Delete Category", "Go Back"};
    private final String currentUser;
    private final UserService userService;
    private final Callback callback;
    public ManagerUI(UserService userService, String currentUser, Callback callback) {
        this.currentUser = currentUser;
        this.userService = userService;
        this.callback = callback;
    }
    public void showManagerMenu(){//"Account", "Modify Supervisors", "View Notifications", "Modify Categories", "View All Products", "Show Events", "SignOut",};//TODO
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
                    while(loopVar1){
                        final int d = Utility.printMenuAndGetValidInput(ModifySupervisorMenu);
                        switch (d) {
                            case 1 -> {}
                            case 2 -> {}
                            case 3 -> {}
                            case 4 -> {loopVar1 = false;}
                            case 5 -> {}
                            case 6 -> {}
                            case 7 -> {}
                            default -> PrintUtil.invalidChoice();
                        }
                    }
                }
                case 3 -> {

                }
                case 4 -> {
                    boolean loopVar1 = true;
                    while(loopVar1){//"View existing Products", "Add Product", "Delete Product", "Go Back"};
                        final int d = Utility.printMenuAndGetValidInput(ModifyCategoryMenu);
                        switch (d) {
                            case 1 -> {}
                            case 2 -> {}
                            case 3 -> {}
                            case 4 -> {loopVar1 = false;}
                            default -> PrintUtil.invalidChoice();
                        }
                    }
                }
                case 5 -> {}
                case 6 -> {}
                case 7 -> {PrintUtil.signedOut();
                    callback.removeCurrentUserExit();
                    loopVar = false;}
                default -> PrintUtil.invalidChoice();
            }
        }
    }//TODO extend

}
