package Module2;

import java.util.Scanner;

public class PHA_M2_Q11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details: ");
        String[] studentDetails = scanner.nextLine().split(",");
        String[] roomDetails = scanner.nextLine().split(",");

        Student student = new Student(studentDetails[0],studentDetails[2],Integer.parseInt(studentDetails[1]),
                new Room(roomDetails[0],roomDetails[1],roomDetails[2]));
        System.out.println(student);
    }
}
