package Carts;

import Products.Product;

public class CartItem {
    private int id = 0;
    private String name = "";
    private int quantity = 0;
    private Double price = 0.0d;
    private Double totalPrice = 0.0d;
    public CartItem(int id){this.id = id;}
    public CartItem(String name){this.name = name;}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice() {
        this.totalPrice = price * quantity;
    }

    public Double subTotal() {return (price * quantity);}
}
