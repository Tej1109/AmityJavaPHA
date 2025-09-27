package Module2;
import java.util.Scanner;

public class PHA_M2_Q8 {public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Details: ");
    String[] detailArr = scanner.nextLine().split(",");
    Loan loan;

    if (detailArr[0].equalsIgnoreCase("Home")){
        loan = new HomeLoan( Double.parseDouble(detailArr[1]) , Integer.parseInt(detailArr[2]));
        System.out.println(detailArr[0]+ " Interest : " + loan.calculateInterest());
    }
    else if (detailArr[0].equalsIgnoreCase("Car")){
        loan = new CarLoan( Double.parseDouble(detailArr[1]) , Integer.parseInt(detailArr[2]));
        System.out.println(detailArr[0]+ " Interest : " + loan.calculateInterest());
    }
    else{
        System.out.println("Wrong I/P");
    }}
}
