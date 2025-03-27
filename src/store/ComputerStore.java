package store;

import java.util.ArrayList;

public class ComputerStore {
    private ArrayList<Product> products;
    private ArrayList<Customer> customers;
    private ArrayList<Order> orders;

    public ComputerStore() {
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Order createOrder(Customer customer, Product[] products, int[] quantities) {
        Order order = new Order(orders.size() + 1, customer, products, quantities, " 2024-05-15", " New");
        orders.add(order);
        return order;
    }

    public void updateStockAfterOrder(Order order) {
        Product[] orderedProducts = order.getProducts();
        int[] quantities = order.getQuantities();

        for (int i = 0; i < orderedProducts.length; i++) {
            for (Product product : products) {
                if (product.getId() == orderedProducts[i].getId()) {
                    int currentStock = product.getStockQuantity();
                    product.setStockQuantity(currentStock - quantities[i]);
                    break;
                }
            }
        }
    }

    public void changeOrderStatus(int orderId, String newStatus) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                order.setStatus(newStatus);
                break;
            }
        }
    }

    public void displayProductsInCategory(String category) {
        System.out.println("Products in category: " + category);
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                product.displayInfo();
            }
        }
    }

    public void displayCustomerOrders(int customerId) {
        System.out.println("Orders for customer ID: " + customerId);
        for (Order order : orders) {
            if (order.getCustomer().getId() == customerId) {
                order.displayDetails();
            }
        }
    }
}
