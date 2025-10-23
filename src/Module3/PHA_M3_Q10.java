package Module3;

import java.util.Scanner;

public class PHA_M3_Q10 {
    public static void main(String[] args){
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Transaction 1 amount  : ");
        int amount1 = scanner.nextInt();
        System.out.println("Transaction 2 amount : ");
        int amount2 = scanner.nextInt();
        Thread  t1 = new BankTransaction(amount1);
        Thread t2 = new BankTransaction(amount2);
        t1.start();
        t2.start();
    }
}
