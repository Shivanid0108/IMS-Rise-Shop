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

//    public static void printPosts(ArrayList<Post> posts) {
//        if (posts.isEmpty()) {
//            System.out.print("\nNo Posts/Feed to display");
//        } else {
//            System.out.print("\n------------------\nPosts :");
//            for (Post post : posts) {
//                post.print();
//            }
//            System.out.print("\n------------------");
//        }
//    }
//
//    public static void editPost(PostService postService, String username, int id) {
//        Post post = new Post(username);
//        post.setId(id);
//        if (postService.checkPost(username, id) || postService.checkPostGroupAdmin(username, id)) {
//            System.out.print("\nEnter the edited post : ");
//            final String newpost = sc.nextLine();
//            post.setPost(newpost);
//            if (postService.editPost(post)) {
//                System.out.print("\nPost edited successfully");
//            } else {
//                System.out.print("\nCould not edit the post");
//            }
//        } else {
//            System.out.print("\nYou are neither the creator nor an admin of the group,if this post belongs to a group.Hence cannot edit");
//        }
//    }
//
//    public static void deletePost(PostService postService, String username, int id) {
//        Post post = new Post(username);
//        post.setId(id);
//        if (postService.checkPost(username, id) || postService.checkPostGroupAdmin(username, id)) {
//            if (postService.deletePost(post)) {
//                System.out.print("\nPost deleted successfully");
//            } else {
//                System.out.print("\nCould not delete the post");
//            }
//        } else {
//            System.out.print("\nYou are neither the creator nor an admin of the group,if this post belongs to a group.Hence cannot edit");
//        }
//    }

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
