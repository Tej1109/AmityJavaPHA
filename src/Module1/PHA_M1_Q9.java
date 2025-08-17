/*
Task:
Write a program to read 10 integers into an array and find the maximum value using a loop.*/
package Module1;
import java.util.Scanner;
public class PHA_M1_Q9 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int max = 0 ;
        for (int i = 0; i < 10 ; i++){
            System.out.printf("Enter element #%d",i+1);
            arr[i] = scanner.nextInt();
        }
        max = arr[0];
        for (int num: arr){
            System.out.println(num);
            if (num > max){
                max = num;}
        }
        System.out.println("The maximum number is : " + max);
        scanner.close();
    }

}
