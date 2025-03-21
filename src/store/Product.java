package store;

public class Product {
    private int id;
    private String name;
    private String category;
    private double price;


    public Product(int id, String name, String category, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int stockQuantity;


    public int GetId(){
        return this.id;
    }

    public void  setId(int id){
        this.id = id;
    }
}
