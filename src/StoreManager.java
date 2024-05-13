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
    public void addProduct(String name, int number, int price, String size, String category, String type) {
        try {
            switch (type) {
                case "Skirt" -> products.add(new Skirt(name, number, price, size, category));
                case "T_Shirt" -> products.add(new T_Shirt(name, number, price, size, category));
                case "Hoodie" -> products.add(new Hoodie(name, number, price, size, category));
                default -> throw new IllegalArgumentException("Invalid product type: " + type);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    // Method to add a user
    public void addUser(String name, String email, String address, String pass) {
        try {
            if (name == null || email == null || address == null || pass == null) {
                throw new IllegalArgumentException("Input parameters cannot be null");
            }
            users.add(new User(name, email, address, pass));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    // Method to add an order
    public void addOrder(Order order) {
        orders.add(order); // Add this method
    }

    // Method to sort products by id
    public void sortProductsById() {
        try {
            if (products == null) {
                throw new IllegalArgumentException("Products list cannot be null");
            }
            Collections.sort(products, Comparator.comparing(Product::getId));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    // Method to sort users by id
    public void sortUsersById() {
        try {
            if (users == null) {
                throw new IllegalArgumentException("Users list cannot be null");
            }
            Collections.sort(users, Comparator.comparing(User::getId));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    // Method to sort orders by id
    public void sortOrdersById() {
        try {
            if (orders == null) {
                throw new IllegalArgumentException("Orders list cannot be null");
            }
            Collections.sort(orders, Comparator.comparing(Order::getId)); // Add this method
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    // Method to print all products
    public void printProducts() {
        try {
            if (products == null) {
                throw new IllegalArgumentException("Products list cannot be null");
            }
            for (Product product : products) {
                System.out.println("Product ID: " + product.getId() + ", Name: " + product.getName());
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    // Method to print all users
    public void printUsers() {
        try {
            if (users == null) {
                throw new IllegalArgumentException("Users list cannot be null");
            }
            for (User user : users) {
                System.out.println("User ID: " + user.getId() + ", Name: " + user.getName() + ", Email: " + user.getEmail()+", Address: "+user.getAddress());
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }


    // Method to print all orders
    public void printOrders() {
        try {
            if (orders == null) {
                throw new IllegalArgumentException("Orders list cannot be null");
            }
            for (Order order : orders) {
                if (order == null) {
                    throw new IllegalArgumentException("Order cannot be null");
                }
                System.out.println("Order ID: " + order.getId());
                System.out.println("Products in the order:");
                for (Product product : order.getProducts()) {
                    if (product == null) {
                        throw new IllegalArgumentException("Product cannot be null");
                    }
                    System.out.println("Product ID: " + product.getId() + ", Name: " + product.getName());
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }


}