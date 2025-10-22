package Module3;

import java.util.Scanner;

public class PHA_M3_Q5 {
    public static void main(String[] args){
    UniversityLogin universityLogin = new UniversityLogin();
    try(Scanner scanner = new Scanner(System.in)){
        System.out.println("Enter your username: ");
        universityLogin.login(scanner.nextLine());
        System.out.println("Login Successful");
    }
    catch (NullPointerException e){
        System.out.println("Exception: Username cannot be null");
    }
}}
