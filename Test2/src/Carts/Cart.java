package Carts;

import java.util.ArrayList;

public class Cart {
    private final Integer id;
    private ArrayList<CartItem> cartItems ;
    private Double subTotal = 0.0;

    public Cart(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public ArrayList<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(ArrayList<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
    public void addCartItem(CartItem cartItem){this.cartItems.add(cartItem);}

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal() {
        this.subTotal = 0.0;
        for(CartItem c:cartItems){
            this.subTotal += c.getTotalPrice();
        }
    }
}
