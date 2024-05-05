public class Main {
    public static void main(String[] args) {
        StoreManager storeManager = new StoreManager();
        storeManager.addProduct("Product 1");
        storeManager.addProduct("Product 2");
        storeManager.addProduct("Product 3");

        storeManager.addUser("User 1", "user1@example.com");
        storeManager.addUser("User 2", "user2@example.com");
        storeManager.addUser("User 3", "user3@example.com");

        Order order1 = new Order();
        order1.addProduct(storeManager.products.get(0));
        order1.addProduct(storeManager.products.get(1));

        Order order2 = new Order();
        order2.addProduct(storeManager.products.get(1));
        order2.addProduct(storeManager.products.get(2));

        storeManager.addOrder(order1);
        storeManager.addOrder(order2);

        System.out.println("Before sorting:");
        storeManager.printProducts();
        storeManager.printUsers();
        storeManager.printOrders();

        storeManager.sortProductsById();
        storeManager.sortUsersById();
        storeManager.sortOrdersById();

        System.out.println("\nAfter sorting:");
        storeManager.printProducts();
        storeManager.printUsers();
        storeManager.printOrders();
    }
}