package Module2;

public class Author {
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender){
        this.email = email;
        this.name = name;
        this.gender = gender;

    }
    String getDetails(){
        return this.name + " (" + this.gender + ")" + "Email: " + this.email;
    }
}
