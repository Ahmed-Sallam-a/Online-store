class User {
    static int nextId = 1; // to increment when creating a product e3tebrha counter byzeed ma3 kol user
    final private int id;
    private String name;
    private String email;
    private String address;
    private String pass;



    // Constructor
    public User(String name, String email, String address,String pass ) {
        this.id = nextId++;
        this.name = name;
        this.email = email;
        this.pass = pass;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress(){
        return this.address;
    }
    // Setters
    public  void setName(String name){
        this.name=name;
    }
    public  void setEmail(String email){
        this.email=email;
    }
    public  void setAddress(String address){
        this.address=address;
    }

    // login function
    public void login(String email, String pass){
        if (!(this.email.equals(email))){
            System.out.println("Invalid email");
        }
        else if (!(this.pass.equals(pass))){
            System.out.println("Invalid password");
        }
        else {
            System.out.println("Welcome");
        }

    }

}