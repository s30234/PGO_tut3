package store;

public class Order {
    private int id;
    private Customer customer;
    private Product[] products;
    private int[] quantities;
    private String orderDate;
    private String status;


    public Order(int id, Customer customer, Product[] products, int[] quantities, String orderDate, String status) {
        this.id = id;
        this.customer = customer;
        this.products = products;
        this.quantities = quantities;
        this.orderDate = orderDate;
        this.status = status;
    }


    public double calculateTotalValue() {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total+=products[i].getPrice()*quantities[i];
        }
        return total;
    }

    public double applyDiscount() {
        double finalPrice = calculateTotalValue();
        if(customer.isLoyalCustomer()){
            finalPrice-= finalPrice*0.1;
        }
        return finalPrice;
    }

    public void displayDetails() {
        System.out.println("Order ID: " + id + "Customer: " + customer.getFirstName() + " " + customer.getLastName() + "Order date: "+ orderDate + "Order status: " + status);
    };





    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setQuantities(int[] quantities) {
        this.quantities = quantities;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }




    public Product[] getProducts() {
        return products;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int[] getQuantities() {
        return quantities;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }



}
