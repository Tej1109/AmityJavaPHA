package Module1;/*
Task: Write a program to check if a person is eligible to vote.
• Input: age and citizenship status (true or false).
• Use logical operators (&&, ||) to decide eligibility.
 */
import java.util.Scanner;
public class PHA_M1_Q4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Are you a citizen of India? (true/false) : ");
        boolean citizenship = scanner.nextBoolean();
        if (age  >= 18 && citizenship){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
        scanner.close();
    }
}
