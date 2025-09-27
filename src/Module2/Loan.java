package Module2;

abstract class Loan {
    double principal;
    double rate;
    int time;

    Loan(double principal, double rate, int time){
        this.principal = principal;
        this.rate = rate;
        this.time  = time;
    }
    abstract double calculateInterest();
}
