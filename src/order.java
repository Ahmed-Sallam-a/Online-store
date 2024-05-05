import java.util.ArrayList;
import java.util.List;
class Order {
    static int nextId = 1;  // to increment when creating a product e3tebrha counter byzeed ma3 kol order
    int id;
    List<Product> products;

    // Constructor
    public Order() {
        this.id = nextId++;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }
}