public class Skirt extends Product {
    static final String type = "Skirt";


    public Skirt(String name) {
        super();
        this.name=name;
    }


    public Skirt(String name, int number) {
        super(name, number);
    }

    public Skirt(String name, int number, int price) {
        super(name, number);
        this.price=price;
    }

    public Skirt(String name, int number, int price, String size) {
        super(name, number);
        this.price=price;
        this.size=size;
    }

    public Skirt(String name, int number, int price, String size, String category) {
        super(name, number);
        this.price=price;
        this.size=size;
        this.category=category;
    }

    @Override
    public boolean isAvailable() {
        if(number > 0)
            return true;
        else
            return false;
    }

    public void addStock(int number){
        this.number += number;
    }

    public void viewStock(){
        System.out.println(this.number);
    }

    public void sellProduct(int number){
        this.number -= number;
    }
}
