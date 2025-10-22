package Module3;

import java.util.Scanner;

public class PHA_M3_Q3 {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,0};
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter index");
            int index = scanner.nextInt();
            System.out.println("Enter divisor");
            int  divisor = scanner.nextInt();
            int  result = arr1[index]/divisor;
            System.out.println("The result is  + " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Dude you divided by zero\nException :  " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index you chose doesnt exist in array \nException : " + e);
        }
    }
}
