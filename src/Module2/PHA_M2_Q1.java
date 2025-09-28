package Module2;
import java.util.Scanner;

public class PHA_M2_Q1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Department details (deptName,hodName)  : ");
        String[] dept_Details  =  scanner.nextLine().split(",");

        Department dept = new Department(dept_Details[0],dept_Details[1]); //department init
        System.out.println("Enter the number of professors : ");
        int num_profs  = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num_profs; i++){
            System.out.println("Enter professor " + (i+1) + " details : name,employeeID,specialization");
            String[] tempProfArr = scanner.nextLine().split(",");
            dept.addProfessor(new Professor(tempProfArr[0],tempProfArr[1],tempProfArr[2]));}
        System.out.println(dept);
    }

}
