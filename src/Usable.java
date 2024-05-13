public interface Usable {
    void sellProduct(int number);
    void viewStock();
    void addStock(int number);
    int getStock();
     default public boolean isAvailable() {
        if(this.getStock() > 0)
            return true;
        else
            return false;
    }
}
