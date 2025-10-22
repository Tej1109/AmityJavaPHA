package Module3;

public class ATM {
    double balance;
    ATM(double balance){
        this.balance = balance;
    }

    public void withdraw(double amt) throws WithdrawGreaterThanBalanceException {
        if (this.balance < amt){
            throw new WithdrawGreaterThanBalanceException();
        }
        this.balance -= amt;
    }
}
