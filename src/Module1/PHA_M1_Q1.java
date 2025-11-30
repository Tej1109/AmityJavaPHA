package Module1;
import  java.util.Scanner;
public class PHA_M1_Q1 {
    public static void main(String[] args){
        String name;
        int rollNo;
        double marks;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        System.out.print("Please enter your roll number: ");
        rollNo = scanner.nextInt();
        System.out.print("Please enter your marks : ");
        marks = scanner.nextFloat();
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNo);
        System.out.printf("Marks : %.2f",marks);
        scanner.close();
    }
}
