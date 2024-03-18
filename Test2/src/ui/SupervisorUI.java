package ui;


import Users.UserService;
import Utils.PrintUtil;
import Utils.Utility;

public class SupervisorUI {
    private static final String[] SupervisorMenu = new String[]{"Supervisor Menu", "Account", "Modify Managers", "SignOut",};//TODO
    private static final String[] ModifyManagerMenu = new String[]{"Modify Manager Menu", "View Employed Managers", "Employ a Manager", "Fire a manager", "Go Back"};
    private final String currentUser;
    private final UserService userService;
    private final Callback callback;
    public SupervisorUI(UserService userService, String currentUser, Callback callback) {
        this.currentUser = currentUser;
        this.userService = userService;
        this.callback = callback;
    }
    public void showSupervisorMenu(){
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
