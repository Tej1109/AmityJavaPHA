package Module1;/*
Task: Accept two integers from the user and perform addition, subtraction, multiplication, division, and modulus.
 Display results for each operation.
 */
import  java.util.Scanner;
public class PHA_M1_Q3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second integer: ");
        int num2 = scanner.nextInt();
        if (num2 == 0){
            System.out.println("The second number cannot be 0 as division isn't possible.");
        }
        else {
        System.out.println("Addition: "  + (num1  + num2));
        System.out.println("Subtraction : "  + (num1  - num2));
        System.out.println("Multiplication : "  + (num1  * num2));
        System.out.printf("Division : %.2f \n", (num1*1.0/num2));
        System.out.println("Modulo : "  + (num1%num2));}
        scanner.close();
    }
}
