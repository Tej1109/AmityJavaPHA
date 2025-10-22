package Module3;

public class InvalidMarksException extends Exception{
    InvalidMarksException(){
        super("Exception : Marks must be between 0 and 100");
    }
}
