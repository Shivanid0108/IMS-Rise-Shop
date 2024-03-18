package Utils;

public class PrintUtil {
    public static void welcomeText() {
        System.out.print("\nBonjour! CaVa bien?.\n Welcome to RiseNShop\n\t\t\t\t-An Inventory Management Application\n\n Usage Instructions :-\n\t-In any Menu, exit application by pressing -1\n\t-Navigate using number input based on available choices.");
    }

    public static void invalidChoice() {
        System.out.print("\nInvalid Choice");
    }
    public static void invalidRole() {
        System.out.print("\nInvalid Role. Check the registration Properly");
    }
    public static void askLogin() {
        System.out.print("\nWould you like to login. 1. Yes 2. No");
    }
    public static void exitLogin() {
        System.out.print("\nLogin aborted");
    }
    public static void askName() {
        System.out.print("\nEnter your name : ");
    }
    public static void askUsername() {
        System.out.print("\nEnter your username : ");
    }
    public static void notValidUsername() {
        System.out.print("\nUsername must consist of 6-30 characters starting with a lowercase alphabet and made of alphabets and numbers.\nEnter again : ");
    }
    public static void existUser() {
        System.out.print("\nUsername taken.Try a different username\nEnter : ");
    }

    public static void askPass() {
        System.out.print("\nEnter your password : ");
    }

    public static void notValidPass() {
        System.out.print("\nInvalid Password.Must contain one digit,one Lowercase character,one Upper case character,one special case character and must be between 8 to 20 characters in length.\nEnter again : ");
    }

    public static void wrongPass() {
        System.out.print("\nWrong Password.Try again");
    }

    public static void askDob() {
        System.out.print("\nEnter your date of birth(DD-MM-YYYY) : ");
    }

    public static void notValidDob() {
        System.out.print("\nNot a valid date.Format DD-MM-YY.use / or . or - for separation.Enter again : ");
    }

    public static void askBio() {
        System.out.print("\nEnter your bio : ");
    }

    public static void createdUser(String user) {
        System.out.print("\nUser " + user + " created successfully");
    }

    public static void signedIn(String username) {
        System.out.print("\nUser " + username + " successfully signed in.");
    }

    public static void userNotExist() {
        System.out.print("\nUsername entered does not exist.");
    }

    public static void askPost() {
        System.out.print("\nEnter the post : ");
    }

    public static void addPostSuccess() {
        System.out.print("\nPost added successfully");
    }

    public static void addPostFail() {
        System.out.print("\nError while adding Post");
    }

    public static void askPostId() {
        System.out.print("\nEnter the post id to view");
    }

    public static void postNotExist() {
        System.out.print("\nPost does not exist");
    }

    public static void noConnections() {
        System.out.print("\nNo Connections exist.");
    }

    public static void noDelete() {
        System.out.print("Cannot delete any");
    }

    public static void noRequests() {
        System.out.print("\nNo Requests available");
    }

    public static void noSelf() {
        System.out.print("\nCannot do Operation with/on Self");
    }

    public static void notGroupMember() {
        System.out.print("\nYou are not a member of the group");
    }

    public static void groupNotExists() {
        System.out.print("\nGroup does not exist");
    }

    public static void notConnection() {
        System.out.print("\nYou are not Connected");
    }

    public static void notGroupAdmin() {
        System.out.print("\nYou are not an Admin to this group");
    }

    public static void signedOut() {
        System.out.print("\nSuccessfully Signed out");
    }

    public static void deletedUserSuccess(String currentUser) {
        System.out.print("\nUser " + currentUser + " deleted successfully");
    }

    public static void deletedUserFail(String currentUser) {
        System.out.print("\nUser " + currentUser + " couldn't be deleted");
    }
}
