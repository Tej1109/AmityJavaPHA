package Module3;

public class PHA_M3_Q10 {
    public static void main(String[] args){
        Thread  t1 = new BankTransaction(199999);
        Thread t2 = new BankTransaction(199);
        t2.start();
        t1.start();
    }
}
