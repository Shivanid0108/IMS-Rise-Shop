package ui;

import Carts.Cart;
import Carts.CartItem;
import Products.ProductService;
import Users.UserService;
import Utils.PrintUtil;
import Utils.Utility;

import java.util.ArrayList;
import java.util.Scanner;

public class CashierUI {
    private static final String[] CashierMenu = new String[]{"Cashier Menu", "Account", "Create Cart", "View/Delete Carts", "View Authorized Payments", "Show Events", "SignOut",};//TODO
    private static final String[] CartMenu = new String[]{"Cart Menu","Add product by id", "Add product by name", "Remove product", "Checkout Cart", "Go Back"};
    private static final String[] ViewCartMenu = new String[]{"View Cart Menu", "View Complete Cart", "Delete Cart", "Go back"};
    private final String currentUser;
    private final UserService userService;
    private final ProductService productService;
    private final Callback callback;
    static final Scanner sc = new Scanner(System.in);

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
                    productService.createCart();
                    ArrayList<Integer> carts = productService.viewCarts();
                    System.out.println("\nActive Carts are:\n");
                    for(Integer i:carts){System.out.println(i);}
                }
                case 3 -> {
                    boolean loopVar1 = true;
                    while(loopVar1){
                        final int d = Utility.printMenuAndGetValidInput(ViewCartMenu);//"View Complete Cart", "Delete Cart", "Go back"};
                        switch (d) {
                            case 1 -> {viewCompleteCart();}
                            case 2 -> {deleteCart();}
                            case 3 -> {loopVar1 = false;}
                            default -> PrintUtil.invalidChoice();
                        }
                    }
                }
                case 4 -> {
                    Utility.printPayments(productService.viewAuthorised());
                }
                case 5 -> {PrintUtil.printEvents();}
                case 6 -> {
                    PrintUtil.signedOut();
                    callback.removeCurrentUserExit();
                    loopVar = false;
                }
                default -> PrintUtil.invalidChoice();
            }
        }
    }//TODO extend
    public void deleteCart(){
        PrintUtil.askId();
        int id = Integer.parseInt(sc.nextLine());
        if(productService.cartExists(id)){
            if(productService.cartNotEmpty(id)) {
                ArrayList<CartItem> cart = productService.viewCartItems(id);
                for (CartItem i : cart) {
                    productService.updateAvailableQuantity(id, productService.getQuantity(id) + productService.getCartItemQuantity(productService.getProductName(i.getId()), id));
                }
            }
            productService.deleteCart(id);
            System.out.println("\nCart with entered id has been deleted");
        }else{System.out.println("\nCart with entered id does not exist");}
    }
    public void viewCompleteCart() {
        PrintUtil.askId();
        int id = Integer.parseInt(sc.nextLine());
        if(productService.cartExists(id)){
            if(productService.cartNotEmpty(id)){
                if(productService.viewCartItems(id)!=null){
                Utility.printCartItems(productService.viewCartItems(id));}
            }else{System.out.println("\nCart is Empty. Please add items");}
            boolean loopVar = true;
            while (loopVar) {
                final int c = Utility.printMenuAndGetValidInput(CartMenu);//"Add product by id", "Add product by name", "Remove product", "Checkout Cart", "Go Back"};
                switch (c) {
                    case 1 ->{
                        PrintUtil.askId();
                        int pid = Integer.parseInt(sc.nextLine());
                        if(productService.productExists(pid)){
                            PrintUtil.askQuantity();
                            int quant = Integer.parseInt(sc.nextLine());
                            int quantAvail = productService.getQuantity(pid);
                            if(quantAvail>=quant){
                                productService.updateAvailableQuantity(pid, (quantAvail-quant));
                                CartItem cItem = new CartItem(id);
                                cItem.setQuantity(quant);
                                cItem.setName(productService.getProductName(pid));
                                cItem.setPrice(productService.getPrice(pid));
                                cItem.setTotalPrice();
                                if(productService.createCartItem(cItem)){System.out.println("\nThe item is added to the cart Successfully");}
                                else{System.out.println("\nThe item could not be added");}
                            }else{System.out.println("\nThe product does not have sufficient quantity, reduce the quantity and add again.");}
                        }
                        else{System.out.println("\nProduct with given Id does not exist.");}
                    }
                    case 2 ->{
                        PrintUtil.askName();
                        String pname = sc.nextLine();
                        if(productService.productExists(pname)){
                            PrintUtil.askQuantity();
                            int quant = Integer.parseInt(sc.nextLine());
                            int quantAvail = productService.getQuantity(pname);
                            if(quantAvail>=quant){
                                CartItem cItem = new CartItem(pname);
                                cItem.setId(productService.getProductId(pname));
                                productService.updateAvailableQuantity(cItem.getId(), (quantAvail-quant));
                                cItem.setQuantity(quant);
                                cItem.setPrice(productService.getPrice(pname));
                                cItem.setTotalPrice();
                                if(productService.createCartItem(cItem)){System.out.println("\nThe item is added to the cart Successfully");}
                                else{System.out.println("\nThe item could not be added");}
                            }else{System.out.println("\nThe product does not have sufficient quantity, reduce the quantity and add again.");}
                        }
                        else{System.out.println("\nProduct with given Name does not exist.");}
                    }
                    case 3 ->{//Remove Product
                        PrintUtil.askName();
                        String pname = sc.nextLine();
                        if(productService.productsExistsinCart(pname, id)){
                            productService.updateAvailableQuantity(id,productService.getQuantity(id) + productService.getCartItemQuantity(pname,id));
                            productService.deleteCartItem(pname);
                            System.out.println("\nProduct with given Name removed.");
                        }else{System.out.println("\nProduct with given Name does not exist.");}
                    }
                    case 4 ->{//Checkout Cart
                        System.out.println("\nEnter the payment Method: ");
                        String s = sc.nextLine();
                        Cart cart = new Cart(id);
                        cart.setCartItems(productService.viewCartItems(id));
                        for(CartItem cItem:cart.getCartItems()){
                            cItem.setTotalPrice();
                        }
                        cart.setSubTotal();
                        productService.authoriseCart(id,cart.getSubTotal(),s);
                        System.out.println("\nThe cart is Authorised");
                    }
                    case 5 -> {loopVar = false;}
                    default -> PrintUtil.invalidChoice();
                }
            }
        }else{System.out.println("\nCart with given Id does not exist");}
    }
}
