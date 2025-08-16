package Module1;
import java.util.Scanner;
public class PHA_M1_Q6 {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want the table of : ");
        int num  =  scanner.nextInt();
        for (int i = 1;  i <= 10 ;i++ ){
            System.out.printf("%d x %d = %d\n",num,i,num*i);
        }
        scanner.close();
    }
}
