package Carts;

public class Authorised {
    private int id;
    private Double total;
    private String method = "";
    public Authorised(int id, Double total, String method){
        this.id = id;
        this.total = total;
        this.method = method;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
