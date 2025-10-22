package Module3;

import java.util.Scanner;

class MinimumAmountException extends Exception{
    MinimumAmountException(){
        super("Exception: Minimum cart value must be ₹500");
    }
}
class OnlineShopping{
    int amount;
    public void placeOrder(int amount) throws MinimumAmountException{
        if (amount < 500){
            throw new MinimumAmountException();
        }
        else{
            System.out.println("Order Placed");
            this.amount = amount;
        }
    }
}


public class PHA_M3_Q6 {
    public static void main(String[] args){
    OnlineShopping onlineShopping = new OnlineShopping();
    try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter cart amount: ");
        onlineShopping.placeOrder(scanner.nextInt());
    }
    catch (MinimumAmountException e){
        System.out.println(e.getMessage());
    }
}}
