package Module2;

import java.util.Scanner;

public class PHA_M2_Q3 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Employee employee;
        System.out.println("Enter details: ");
        String[] details = scanner.nextLine().split(",");

        if (details.length == 4){
            employee = new Employee(details[1],details[2],Double.parseDouble(details[3]));
            System.out.println(employee);
        } else if (details.length == 5) {
            employee = new Manager(details[1],details[2],Double.parseDouble(details[3]),Double.parseDouble(details[4]));
            System.out.println(employee);
        }
    }
}
