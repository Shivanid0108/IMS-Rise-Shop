package Utils;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {
    public static final Scanner sc = new Scanner(System.in);
    public static final String[] viewPostMenu = new String[]{"Post Menu", "Edit Post", "Delete Post", "Go Back"};
    public static final String[] retryMenu = new String[]{"Retry Menu", "Retry", "Go Back"};
    public static final String[] postMenu = new String[]{"Post Menu", "Add Post", "View Post", "Go Back"};
    public static int printMenuAndGetValidInput(String[] menuItems) {
        printMenu(menuItems);
        return readInteger();
    }
    public static int readInteger() {
        System.out.print("\nEnter : ");
        String c = sc.nextLine();
        try {
            Integer.parseInt(c);
            if (Integer.parseInt(c) == -1) {
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.print("\nInvalid Integer.Enter a proper Integer");
            return readInteger();
        }
        return Integer.parseInt(c);
    }
        public static boolean isNotValidUsername(String name) {
        String regex = "\\w{6,30}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        if (!m.matches()) {
            System.out.print("\nString length not in range");
            return true;
        }
        regex = "^[a-z][a-z0-9]*$";
        p = Pattern.compile(regex);
        m = p.matcher(name);
        if (!m.matches()) {
            System.out.print("\nDoes not start with alphabet or contains unaccepted characters");
            return true;
        }
        regex = "^[a-z]\\w{5,29}$";
        p = Pattern.compile(regex);
        m = p.matcher(name);
        return !m.matches();
    }

    public static void printMenu(String[] menuItems) {
        System.out.print("\n\n" + menuItems[0]);
        for (int i = 1; i < menuItems.length; i++) {
            System.out.printf("\n%d. %s", i, menuItems[i]);
        }
    }
}
