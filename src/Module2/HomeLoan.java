package Module2;
public class HomeLoan extends Loan{
    static double home_rate = 8;
    HomeLoan(double principal, int time){
        super(principal,home_rate,time);
    }

    @Override
    double calculateInterest() {
        return ((this.principal * this.rate * this.time)/100);
    }
}

