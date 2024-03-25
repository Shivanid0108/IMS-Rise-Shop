package Products;

public class Product {
    private final String name;
    private final Integer quantityAvailable;
    private final Double price;
    private String category = "";
    private String description = "";
    private Integer id = -1;
    private String location = "";
    private Integer supplier_id = -1;

    public Product(String name, Integer quantity, Double price) {
        this.name = name;
        this.quantityAvailable = quantity;
        this.price = price;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return this.price;
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }
}
