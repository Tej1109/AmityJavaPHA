package Module2;

import java.util.Scanner;

public class PHA_M2_Q14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account details: ");
        String[] reservationDetails = scanner.nextLine().split(",");
        Account account = new Account(Integer.parseInt(reservationDetails[0]),reservationDetails[1],
                Double.parseDouble(reservationDetails[2]));
        String choice;
        System.out.println("Welcome to our Banking Program\n Choose withdraw for withdrawing\n" +
                " Deposit for Deposit \n Details to get Details\n Balance for balance info");
        do{
            System.out.println("Enter your choice");
            choice = scanner.nextLine();
            String[] choiceArr = choice.split(" ");
            if (choiceArr[0].equalsIgnoreCase("deposit")){
                account.deposit(Double.parseDouble(choiceArr[1]));
            } else if (choiceArr[0].equalsIgnoreCase("withdraw")) {
                account.withdraw(Double.parseDouble(choiceArr[1]));
            }
            else if (choiceArr[0].equalsIgnoreCase("balance")){
                account.showBalance();
            } else if (choiceArr[0].equalsIgnoreCase("details")) {
                System.out.println(account.getAccountDetails());
            } else if (choiceArr[0].equalsIgnoreCase("quit")) {
                System.out.println("Thanks for using");

            }
            else {
                System.out.println("invalid choice");
            }


        }while (!choice.equalsIgnoreCase("quit"));
    }
}
