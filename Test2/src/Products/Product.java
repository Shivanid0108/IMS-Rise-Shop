package Products;

public class Product {
    private final String name;
    private final Integer quantityAvailable;
    private final Double price;
    private String description = "";
    private Integer id = -1;
    private String location = "";
    Product(String name, Integer quantity, Double price){
        this.name = name;
        this.quantityAvailable = quantity;
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public String getName() {
        return name;
    }
    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }
    public String getDescription() {
        return description;
    }
    public Integer getId() {
        return id;
    }
    public String getLocation() {
        return location;
    }
    public Supplier getSupplier() {
        return supplier;
    }
    private Supplier supplier = null;

    public Double getPrice(){
        return this.price;
    }
}
