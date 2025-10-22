package Module3;

public class WithdrawGreaterThanBalanceException extends  Exception{
    WithdrawGreaterThanBalanceException(){
        super("Exception : Insufficient Balance");
    }
}
