import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Define the StoreManager class
public class StoreManager {
    ArrayList<Product> products;
    ArrayList<User> users;
    ArrayList<Order> orders;

    // Constructor
    public StoreManager() {
        products = new ArrayList<>();
        users = new ArrayList<>();
        orders = new ArrayList<>();
    }

    // Method to add a product
   // public void addProduct(String name) {
    //    products.add(new Product(name));
    //}

    // Method to add a user
    public void addUser(String name, String email,String address,String pass) {
        users.add(new User(name, email, address, pass));
    }

    // Method to add an order
    public void addOrder(Order order) {
        orders.add(order); // Add this method
    }

    // Method to sort products by id
    public void sortProductsById() {
        Collections.sort(products, Comparator.comparing(Product::getId));
    }

    // Method to sort users by id
    public void sortUsersById() {
        Collections.sort(users, Comparator.comparing(User::getId));
    }

    // Method to sort orders by id
    public void sortOrdersById() {
        Collections.sort(orders, Comparator.comparing(Order::getId)); // Add this method
    }

    // Method to print all products
    public void printProducts() {
        for (Product product : products) {
            System.out.println("Product ID: " + product.getId() + ", Name: " + product.getName());
        }
    }

    // Method to print all users
    public void printUsers() {
        for (User user : users) {
            System.out.println("User ID: " + user.getId() + ", Name: " + user.getName() + ", Email: " + user.getEmail());
        }
    }

    // Method to print all orders
    public void printOrders() {
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getId());
            System.out.println("Products in the order:");
            for (Product product : order.getProducts()) {
                System.out.println("Product ID: " + product.getId() + ", Name: " + product.getName());
            }
        }
    }
}