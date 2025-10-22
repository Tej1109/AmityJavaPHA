package Module3;

import java.util.Scanner;

public class PHA_M3_Q1 {
    public static void main(String[] args){
        System.out.println("Welcome to the ATM");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter your balance: ");
        double  balance = scanner.nextDouble();
        ATM atm = new ATM(balance);

        try{
            System.out.print("Enter the withdrawal amount");
            double withdraw = scanner.nextDouble();
            atm.withdraw(withdraw);
            System.out.println("Your balance after withdrawal is  :  " + atm.balance );
        }
        catch (WithdrawGreaterThanBalanceException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction Completed");
        }
    }

}
