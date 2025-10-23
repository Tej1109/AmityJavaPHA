package Module3;

public class BankTransaction extends Thread{
    BankTransaction(int amt){
        if (amt > 5000){
            this.setPriority(MAX_PRIORITY);
        }
    }

    @Override
    public void run(){
        if (this.getPriority() == 10){
            System.out.println("High Priority Process runs first");
        }
        else {
            System.out.println("Low Priority process runs later");
        }
    }
}
