package Module3;

import java.util.Scanner;

public class PHA_M3_Q4 {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            StudentMarks studentMarks = new StudentMarks();
            System.out.println("Enter Marks : ");
            studentMarks.enterMarks(scanner.nextInt());
        }
        catch (InvalidMarksException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Thank you for using our program");
        }
    }
}
