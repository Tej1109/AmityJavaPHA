package Module4;

import java.security.cert.TrustAnchor;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class PHA_M4_Q5 {
    static  LinkedHashSet<String> enrolled = new LinkedHashSet<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
         while (choice!=2){
             System.out.print("Enroll : ");
             String name = scanner.nextLine();
             System.out.print("Choice: ");
             choice = scanner.nextInt();
             scanner.nextLine();
             addEnrolledStudent(name);
        }
     displayEnrolledStudent();
    }

    static void addEnrolledStudent(String name){
        enrolled.add(name);
    }

    static void displayEnrolledStudent(){
        for(String name : enrolled ){
            System.out.println("Name : " + name);
        }
    }
}
