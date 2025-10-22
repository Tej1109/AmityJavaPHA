package Module3;

public class InvalidAgeException extends Exception{
    InvalidAgeException(){
        super("Exception: Age must be above 17 for registration");
    }
}
