package Module2;

public class Account {
    int accNo;
    String holderName;
    private double balance;

    Account(int accNo,String holderName,double balance){
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    String getAccountDetails(){
        return "Account Number: " + accNo + "\nHolder Name: " + holderName + "\nBalance : " + balance;
    }

    void deposit(double amt){
        if (amt < 0){
            System.out.println("Wrong amount entered");
        }
        else {
            this.balance += amt;
        }
    }

    void withdraw(double amt){
        if (amt > this.balance){
            System.out.println("You cannot withdraw more than your balance");
        }
        else {
            this.balance -= amt;
        }
    }


    void showBalance(){
        System.out.println("Your balance is : " + balance);
    }
}
