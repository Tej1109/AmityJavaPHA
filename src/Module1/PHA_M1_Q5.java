package Module1;/*
Write a program that:
• Takes two numbers and an operator symbol (+, -, *, /) from the user.
• Uses if-else statements to perform the appropriate operation.
 */

import  java.util.Scanner;

public class PHA_M1_Q5 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();
    System.out.println("Choose one of the following for operations: \n+ --> Add\n- --> Subtract\n* --> Multiplication\n/ --> Division");
    System.out.print("Enter your choice:  ");
    scanner.nextLine();
    char choice = scanner.next().charAt(0);
    if (choice == '+'){
        System.out.println("You have chosen addition!");
        System.out.printf("The sum of %.2f + %.2f is %.2f", num1, num2, num1 + num2 );
    } else if (choice == '-') {
        System.out.println("You have chosen Subtraction!");
        System.out.printf("The difference of %.2f - %.2f is %.2f", num1, num2, num1 - num2 );
    } else if (choice == '*') {
        System.out.println("You have chosen Multiplication!");
        System.out.printf("The multiplication of %.2f x %.2f is %.2f", num1, num2, num1*num2 );
    } else if (choice == '/') {
        if (num2 == 0){
            System.out.println("Number 2 is 0, thus cannot divide!!");
        }
        else {
            System.out.println("You have chosen Division!");
            System.out.printf("The division of %.2f / %.2f is %.2f", num1, num2, num1/num2 );
        }
        
    }
    else {
        System.out.println("Please choose a valid option");
    }
    scanner.close();
}
}
