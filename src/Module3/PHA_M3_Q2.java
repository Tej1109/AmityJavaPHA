package Module3;

import java.util.Scanner;

public class PHA_M3_Q2 {
    public static void main(String[] args){
        System.out.println("Welcome to Student Registration");
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            Student student = new Student();
            student.registerStudent(name,age);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
