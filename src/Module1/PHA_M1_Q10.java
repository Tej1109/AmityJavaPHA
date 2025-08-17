/* Task:

Write a program that:
        • Reads marks of 5 subjects into an array.
        • Calculates the average marks.
        • Uses if-else to assign grades:
o >= 90: A
o >= 75: B
o >= 50: C
o Else: Fail */
package Module1;
import  java.util.Scanner;
public class PHA_M1_Q10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] marksArray = new double[5] ;
        double avgMarks = 0;
        char grade;
        for (int i = 0; i < marksArray.length ; i++){
            System.out.printf("Please enter your marks of subject %d :  ", i+1);
            marksArray[i] = scanner.nextDouble();
        }
        for (double marks :marksArray){
            avgMarks += marks;
        }
        avgMarks /= marksArray.length;
        System.out.printf("Your average marks are: %.2f\n",avgMarks);

        if (avgMarks >= 90){
            grade = 'A';
        } else if (avgMarks >= 75) {
            grade = 'B';
        } else if (avgMarks >= 50) {
            grade = 'C';
        }
        else {
            grade = 'F';
        }

        if (grade != 'F'){
            System.out.println("Congrats! You have passed, here is your grade: " + grade);
        }
        else {
            System.out.println("Sorry you have failed :( ");
        }


    }
}
