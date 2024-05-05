class Product {
    static int nextId = 1; // to increment when creating a product e3tebrha counter byzeed ma3 kol product
    int id;
    String name;

    // Constructor
    public Product(String name) {
        this.id = nextId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}