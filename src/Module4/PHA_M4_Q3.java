package Module4;

import java.util.Scanner;
import java.util.HashMap;


public class PHA_M4_Q3 {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<Integer,String> accounts = new HashMap<>();
    public static void main(String[] args){
        int choice;
        System.out.println("Welcome to our program");
        System.out.println("1. Add Account\n" +
                "2. Get Customer Name\n" +
                "3. Display All Accounts\n" +
                "4. Exit");
        do{
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case  1 -> {
                    System.out.println("Enter account number :");
                    int accno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    accounts.put(accno,name);
                    System.out.println("Added account successfully");}
                case 2 -> {
                    System.out.println("Enter account number : ");
                    int accno = scanner.nextInt();
                    System.out.println("The name associated with account number " + accno + "is: ");
                    System.out.println(accounts.get(accno));
                }
                case 3 -> {
                    System.out.println("List of complete available accounts: ");
                    for (int accno : accounts.keySet()){
                        System.out.println(accno + " -> " + accounts.get(accno));
                    }
                }
            }
        } while (choice !=4);
        System.out.println("Thanks for using!");
    }
}
