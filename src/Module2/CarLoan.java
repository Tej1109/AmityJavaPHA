package Module2;

public class CarLoan extends  Loan{
    static double car_rate = 10;

    CarLoan(double principal, int time){
        super(principal,car_rate,time);
    }

    @Override
    double calculateInterest(){
        return ((this.principal * this.rate * this.time)/100);
    }
}
