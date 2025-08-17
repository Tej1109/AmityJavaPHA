/*
Write a program that:
• Reads marks of 5 students into an integer array.
• Prints each student’s marks.
 */
package Module1;
import java.util.Scanner;
public class PHA_M1_Q8 {
    public static void main(String[] args){
        int[] marksArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i  < 5; i++){
            System.out.printf("Hi Student %d, Enter your marks: ", i+1);
            marksArray[i] = scanner.nextInt();
        }
        for (int i = 0; i  < 5; i++){
            System.out.printf("Marks of Student %d are %d\n",i+1,marksArray[i]);
        }
        scanner.close();
    }
}
