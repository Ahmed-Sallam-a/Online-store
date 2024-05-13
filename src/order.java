

import java.util.ArrayList;
import java.util.List;
import java.util.Date;


class Order {
    static int nextId = 1;  // to increment when creating a product e3tebrha counter byzeed ma3 kol order
    Date date;
    int id;
    List<Product> products;

    // Constructor
    public Order() {
        this.date = new Date();
        this.id = nextId++;
        this.products = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
     
    public String getDate(){
        return date.toString();
    }
    
    public List<Product> getProducts() {
        return products;
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public boolean  searchForItem (Product product ){
        int i ;
        for (i=0; i<products.size(); i++){
            if (!(products.get(i).name.equals(product.name))){
                return true;
            }
        }
        return false;
    }
    
}