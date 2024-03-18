package ui;


import Users.UserService;
import Utils.PrintUtil;
import Utils.Utility;

public class SupervisorUI {
    private static final String[] SupervisorMenu = new String[]{"Supervisor Menu", "Account", "Modify TeamLeaders", "View Notifications", "Modify Categories", "View All Products", "Show Events", "SignOut",};//TODO
    private static final String[] ModifyTLMenu = new String[]{"Modify Team-Leader Menu", "View Employed Team-Leaders", "Employ a Team-Leader", "Fire a Team-Leader", "Go Back"};
    private static final String[] ModifyProductMenu = new String[]{"Modify Products Menu", "View existing Products", "Add Product", "Delete Product", "Go Back"};
    private final String currentUser;
    private final UserService userService;
    private final Callback callback;
    public SupervisorUI(UserService userService, String currentUser, Callback callback) {
        this.currentUser = currentUser;
        this.userService = userService;
        this.callback = callback;
    }
    public void showSupervisorMenu(){//{"Account", "Modify TeamLeaders", "View Notifications", "Modify Categories", "View All Products", "Show Events", "SignOut",};//TODO
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
                    while(loopVar1){
                        final int d = Utility.printMenuAndGetValidInput(SupervisorMenu);
                        switch (d) {
                            case 1 -> {}
                            case 2 -> {}
                            case 3 -> {}
                            case 4 -> {loopVar1 = false;}
                            default -> PrintUtil.invalidChoice();
                        }
                    }
                }
                case 3 -> {
                    PrintUtil.signedOut();
                    callback.removeCurrentUserExit();
                    loopVar = false;
                }
                default -> PrintUtil.invalidChoice();
            }
        }
    }//TODO extend

}
