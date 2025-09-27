package Module2;

import java.util.Scanner;

public class PHA_M2_Q9 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Details: ");

        String[] courseDetails = scanner.nextLine().split(",");
        Course course = new Course(courseDetails[0],courseDetails[1]);
        String[] studentDetails = scanner.nextLine().split(",");
        Student2 student;

        if (studentDetails.length == 2 && courseDetails[0].equalsIgnoreCase(studentDetails[1])){
            student = new Student2(studentDetails[0],course);
            System.out.println(student);
        } else if (studentDetails.length == 3 && courseDetails[0].equalsIgnoreCase(studentDetails[1])) {
            student = new PremiumStudent(studentDetails[0],course, Double.parseDouble(studentDetails[2]));
            System.out.println(student);
        }
        else {
            System.out.println("Wrong output format!");
        }

    }
}
