package Module3;

public class BankTransaction extends Thread{
    int amt;
    BankTransaction(int amt){
        this.amt = amt;
        if (amt > 5000){
            this.setPriority(MAX_PRIORITY);
        }
    }

    @Override
    public void run(){
        if (this.getPriority() == 10){
            System.out.println("High Priority Process runs first, Amount  : " + this.amt);
        }
        else {
            System.out.println("Low Priority process runs later, Amount : "  + this.amt);
        }
    }
}
