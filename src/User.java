
import java.util.List;


class InvalidEmailException extends RuntimeException{
    public InvalidEmailException(String message){
        super(message);
    }
}
class InvalidPassException extends RuntimeException{
    public InvalidPassException(String message){
        super(message);
    }
}

public class User {
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
    
}