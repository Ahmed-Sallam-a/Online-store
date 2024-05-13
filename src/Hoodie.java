public class Hoodie extends Product {

    static final String type = "Hoodie";


    public Hoodie(String name) {
        super();
      this.name=name;
    }


    public Hoodie(String name, int number) {
        super(name, number);
    }

    public Hoodie(String name, int number, int price) {
        super(name, number);
        this.price=price;
    }

    public Hoodie(String name, int number, int price, String size) {
        super(name, number);
        this.price=price;
        this.size=size;
    }

    public Hoodie(String name, int number, int price, String size, String category) {
        super(name, number);
        this.price=price;
        this.size=size;
        this.category=category;
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
    public int getStock(){return this.number;}
}
