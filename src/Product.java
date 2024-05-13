public abstract class Product implements Usable{
    static int nextId = 1; // to increment when creating a product e3tebrha counter byzeed ma3 kol product
    int id;
    String name;
    float price;
    String size;
    int number;
    String category;

    // Constructor
    public Product() {
        this.id = nextId++;
    }

    public Product(String name, int number) {
        this.id = nextId++;
        this.name = name;
        this.number = number;
    }

    //Setter and getter for Id
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    //Setter and getter for Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //Setter and getter for Price
    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }


    //Setter and getter for Size
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public abstract void sellProduct(int number);
    public abstract void viewStock();
    public abstract void addStock(int number);

}