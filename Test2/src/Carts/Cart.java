package Carts;

public class Cart {
    private final Integer id;
    private CartItem[] cartItems = null;
    private Double subTotal = 0.0;

    Cart(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public CartItem[] getCartItems() {
        return cartItems;
    }

    public void setCartItems(CartItem[] cartItems) {
        this.cartItems = cartItems;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }
}
