package Carts;

import Products.Product;

public class CartItem {
    private Product product = null;
    private Integer quantity = null;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double subTotal() {
        return (product.getPrice() * quantity);
    }
}
