import Users.UserService;
import Utils.PrintUtil;
import Utils.Utility;
import ui.AccountsUI;
import ui.Callback;
import ui.SupervisorUI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    static final Scanner sc = new Scanner(System.in);
//    private static final String[] homeMenu = new String[]{"Home Menu", "Feeds", "MyPage", "Groups", "Messenger", "Account",};//TODO Remove
    private static final String[] TeamLeaderMenu = new String[]{"TeamLeader Menu", "Account",};//TODO
    private static final String[] ManagerMenu = new String[]{"Manager Menu", "Account",};//TODO
    private static final String[] CashierMenu = new String[]{"Cashier Menu", "Account",};//TODO
    private static final String[] startMenu = new String[]{"Start Menu", "SignIn", "Exit"};
    private final UserService userService;
//    private final PostService postService;
//    private final GroupService groupService;
//    private final MessageService messageService;
    private String currentUser = null;
    private String currentRole = null;
    private final Callback callback = new Callback() {
        @Override
        public void exit() {
            //showHomeMenu(); TODO remove
            switch(currentRole){
                case "Supervisor" -> {
                    new SupervisorUI(userService, currentUser, callback).showSupervisorMenu();
                }
                case "Manager" -> {
                    showManagerMenu();
                }
                case "TeamLeader" -> {
                    showTeamLeaderMenu();
                }
                case "Cashier" -> {
                    showCashierMenu();
                }
                default -> PrintUtil.invalidRole();
            }
        }
        @Override
        public void removeCurrentUserExit() {
            currentUser = null;
            currentRole = null;
            start();
        }
    };
    public App(UserService userService){//}, PostService postService, GroupService groupService, MessageService messageService) {
        this.userService = userService;
//        this.postService = postService;
//        this.groupService = groupService;
//        this.messageService = messageService;
    }
    private boolean isValidPass(String pass) {
        final Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–{}:;',?/*~$^+=<>]).{8,20}$");
        Matcher matcher = p.matcher(pass);
        return matcher.matches();
    }
    public void showManagerMenu(){}//TODO code
    public void showTeamLeaderMenu(){}//TODO code
    public void showCashierMenu(){}//TODO code
//    public void showHomeMenu() {
//        boolean loopVar = true;
//        while (loopVar) {
//            final int c = Utility.printMenuAndGetValidInput(homeMenu);
//            switch (c) {
////                case 1 -> {
////                    new FeedsUI(currentUser, postService, callback).showFeedMenu();
////                    loopVar = false;
////                }
////                case 2 -> {
////                    new MyPageUI(currentUser, userService, callback).showMyPageMenu();
////                    loopVar = false;
////                }
////                case 3 -> {
////                    new GroupsUI(currentUser, userService, groupService, postService, callback).showGroupsMenu();
////                    loopVar = false;
////                }
////                case 4 -> {
////                    new MessengerUI(currentUser, userService, messageService, callback).showMessengerMenu();
////                    loopVar = false;
////                }
//                case 5 -> {
//                    new AccountsUI(userService, currentUser, callback).showAccountMenu();
//                    loopVar = false;
//                }
//                default -> PrintUtil.invalidChoice();
//            }
//        }
//    }//TODO

    public void start() {
        while (true) {
            final int c = Utility.printMenuAndGetValidInput(startMenu);
            switch (c) {
                case 2 -> System.exit(0);
//                case 1 -> {
//                    currentUser = registerUser();
//                    PrintUtil.askLogin();
//                    final int d = Utility.readInteger();
//                    switch (d) {
//                        case 1 -> {
//                            currentUser = signInUser(currentUser);
//                            if (currentUser != null) {
//                                showHomeMenu();
//                            }
//                        }
//                        case 2 -> {
//                            currentUser = null;
//                            PrintUtil.exitLogin();
//                        }
//                        default -> {
//                            PrintUtil.invalidChoice();
//                            PrintUtil.exitLogin();
//                        }
//                    }
//                }
                case 1 -> {
                    currentUser = signInUser();
                    currentRole = getCurrentRole(currentUser);
                    if (currentUser != null && currentRole != null) {
                        //showHomeMenu(); TODO remove
                        switch(currentRole){
                            case "Supervisor" -> {
                                new SupervisorUI(userService, currentUser, callback).showSupervisorMenu();
                            }
                            case "Manager" -> {
                                showManagerMenu();
                            }
                            case "TeamLeader" -> {
                                showTeamLeaderMenu();
                            }
                            case "Cashier" -> {
                                showCashierMenu();
                            }
                            default -> PrintUtil.invalidRole();
                        }
                    }
                }
                default -> PrintUtil.invalidChoice();
            }
        }
    }
    private boolean isValidDate(String dob) {
        String regex = "^(?:31([/\\-.])(?:0?[13578]|1[02])\\1|(?:29|30)([/\\-.])(?:0?[13-9]|1[0-2])\\2)(?:1[6-9]|[2-9]\\d)?\\d{2}$|^29([/\\-.])0?2\\3(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:16|[2468][048]|[3579][26])00)$|^(?:0?[1-9]|1\\d|2[0-8])([/\\-.])(?:0?[1-9]|1[0-2])\\4(?:1[6-9]|[2-9]\\d)?\\d{2}$";
        Pattern p = Pattern.compile(regex);
        if (dob == null) {
            return false;
        }
        Matcher m = p.matcher(dob);
        return m.matches();
    }
    private String registerUser(String role, Double salary) {
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
        while (!isValidPass(pass)) {
            PrintUtil.notValidPass();
            pass = sc.nextLine();
        }
        PrintUtil.askDob();
        String dob = sc.nextLine();
        while (!isValidDate(dob)) {
            PrintUtil.notValidDob();
            dob = sc.nextLine();
        }
        PrintUtil.askBio();
        final String bio = sc.nextLine();
        String user = userService.createUser(name, username, pass, dob, bio, role, salary);
        PrintUtil.createdUser(user);
        System.out.print("\nUser Details:\n" + name + " | " + username + " | " + dob + " | " + bio + " | " + role + " | " + salary);
        return username;
    }
    private String signInUser() {
        PrintUtil.askUsername();
        String username = sc.nextLine();
        while (Utility.isNotValidUsername(username)) {
            PrintUtil.notValidUsername();
            username = sc.nextLine();
        }
        if (userService.checkUser(username)) {
            PrintUtil.askPass();
            final String pass = sc.nextLine();
            String name = userService.signIn(username, pass);
            if (name == null) {
                PrintUtil.notValidPass();
                return signInUser(username);
            } else {
                PrintUtil.signedIn(username);
                return name;
            }
        } else {
            PrintUtil.userNotExist();
            return null;
        }
    }
    private String getCurrentRole(String username) {
        return userService.getRole(username);
    }
    private String signInUser(String username) {
        if (userService.checkUser(username)) {
            PrintUtil.askPass();
            final String pass = sc.nextLine();
            String name = userService.signIn(username, pass);
            if (name == null) {
                PrintUtil.wrongPass();
                return signInUser(username);
            } else {
                PrintUtil.signedIn(username);
                return name;
            }
        } else {
            PrintUtil.userNotExist();
            return null;
        }
    }
}
