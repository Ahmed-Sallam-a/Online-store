class User {
    static int nextId = 1; // to increment when creating a product e3tebrha counter byzeed ma3 kol user
    int id;
    String name;
    String email;

    // Constructor
    public User(String name, String email) {
        this.id = nextId++;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}