package Utils;

import Products.Product;
import Users.User;

import java.util.ArrayList;

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
        System.out.print("\nEnter the name : ");
    }
    public static void askId() {
        System.out.print("\nEnter the Id : ");
    }
    public static void askQuantity() {
        System.out.print("\nEnter the Quantity : ");
    }
    public static void askPrice() {
        System.out.print("\nEnter the Price per item : ");
    }
    public static void askDescription() {
        System.out.print("\nEnter the Description : ");
    }
    public static void asklocation() {
        System.out.print("\nEnter the Location : ");
    }

    public static void askUsername() {
        System.out.print("\nEnter the username : ");
    }

    public static void notValidUsername() {
        System.out.print("\nUsername must consist of 6-30 characters starting with a lowercase alphabet and made of alphabets and numbers.\nEnter again : ");
    }
    public static void invalidCategory(){System.out.println("\nCategory does not exist. Please enter the category again: ");}
    public static void existUser() {
        System.out.print("\nUsername taken.Try a different username\nEnter : ");
    }

    public static void askPass() {
        System.out.print("\nEnter the password : ");
    }

    public static void notValidPass() {
        System.out.print("\nInvalid Password.Must contain one digit,one Lowercase character,one Upper case character,one special case character and must be between 8 to 20 characters in length.\nEnter again : ");
    }

    public static void wrongPass() {
        System.out.print("\nWrong Password.Try again");
    }

    public static void askDob() {
        System.out.print("\nEnter the date of birth(DD-MM-YYYY) : ");
    }

    public static void notValidDob() {
        System.out.print("\nNot a valid date.Format DD-MM-YY.use / or . or - for separation.Enter again : ");
    }

    public static void askBio() {
        System.out.print("\nEnter the bio : ");
    }

    public static void askSalary() {
        System.out.print("\nEnter the Salary : ");
    }

    public static void askCategoryName() {
        System.out.println("\nEnter the Category name:");
    }

    public static void CategoryExists() {
        System.out.println("\nThe Category already Exists.");
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

    public static void signedOut() {
        System.out.print("\nSuccessfully Signed out");
    }

    public static void deletedUserSuccess(String currentUser) {
        System.out.print("\nUser " + currentUser + " deleted successfully");
    }

    public static void deletedUserFail(String currentUser) {
        System.out.print("\nUser " + currentUser + " couldn't be deleted");
    }

    public static void printUsers(ArrayList<User> users) {
        System.out.println("\nName\tUsername\tDOB\tSalary\tRole\tBio");
        for (User user : users) {
            System.out.println(user.getName() + " | " + user.getUsername() + " | " + user.getDob() + " | " + user.getSalary() + " | " + user.getRole() + " | " + user.getBio());
        }
    }

    public static void userNotExistNotSupervisor() {
        System.out.println("\nUsername entered does not exist or the user is not a Supervisor");
    }

    public static void printStringList(ArrayList<String> list) {
        for (String a : list) {
            System.out.println(a);
        }
    }

    public static void printProducts(ArrayList<Product> a) {
        System.out.println("\nName\tQuantityAvailable\tPrice\tCategory\tid\tLocation\tSupplier_id\tDescription");
        for (Product b : a) {
            System.out.println(b.getName() + " | " + b.getQuantityAvailable() + " | " + b.getPrice() + " | " + b.getCategory() + " | " + b.getId() + " | " + b.getLocation() + " | " + b.getSupplier_id() + " | " + b.getDescription());
        }
    }

    public static void printEvents() {
        System.out.println("New Year's Day: Monday, January 1st, 2024\n" +
                "Good Friday: Friday, March 29th, 2024\n" +
                "Easter Monday: Monday, April 1st, 2024\n" +
                "Victoria Day/National Patriot's Day: Monday, May 20th, 2024\n" +
                "Quebec national Holiday: Monday, June 24th, 2024 (Quebec only)\n" +
                "Canada Day: Monday, July 1st, 2024\n" +
                "British Columbia Day: Monday, August 5th, 2024 (BC only)\n" +
                "Labour Day: Monday, September 2nd, 2024\n" +
                "Thanksgiving Day: Monday, October 14th, 2024\n" +
                "Remembrance Day: Monday, November 11th, 2024\n" +
                "Christmas: Wednesday, December 25th, 2024\n" +
                "Boxing Day: Thursday, December 26th, 2024");
    }

    public static void invalidSupplier() {System.out.println("\nThe supplier id entered does not exist. Please Re-enter: ");}

    public static void askSupplierId() {System.out.println("\nEnter the supplier id from the above list: ");
    }
}
