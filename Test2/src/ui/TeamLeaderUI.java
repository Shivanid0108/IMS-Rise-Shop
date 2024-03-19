package ui;

import Users.UserService;
import Utils.PrintUtil;
import Utils.Utility;

public class TeamLeaderUI {
    private static final String[] TLMenu = new String[]{"TeamLeader Menu", "Account", "Modify Cashiers", "View Notifications", "View All Products", "Show Events", "SignOut",};//TODO
    private static final String[] ModifyCashierMenu = new String[]{"Modify Team-Leader Menu", "View Employed Team-Leaders", "Employ a Team-Leader", "Fire a Team-Leader", "Go Back"};
    private final String currentUser;
    private final UserService userService;
    private final Callback callback;
    public TeamLeaderUI(UserService userService, String currentUser, Callback callback) {
        this.currentUser = currentUser;
        this.userService = userService;
        this.callback = callback;
    }
    public void showTLMenu(){//"Account", "Modify Cashiers", "View Notifications", "View All Products", "Show Events", "SignOut",};//TODO
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
                    while(loopVar1){
                        final int d = Utility.printMenuAndGetValidInput(ModifyCashierMenu);
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
                }
                case 5 -> {}
                case 6 -> {PrintUtil.signedOut();
                    callback.removeCurrentUserExit();
                    loopVar = false;}
                default -> PrintUtil.invalidChoice();
            }
        }
    }//TODO extend
}
