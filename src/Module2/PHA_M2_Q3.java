package Module2;

import java.util.Scanner;

public class PHA_M2_Q3 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details: ");
        Employee[] employees = new Employee[2];

        int i = 0;
        while (i<2){
        Employee employee;

        String[] details = scanner.nextLine().split(",");

        if (details.length == 4){
            employee = new Employee(details[1],details[2],Double.parseDouble(details[3]));
            employees[i] = employee;
        } else if (details.length == 5) {
            employee = new Manager(details[1],details[2],Double.parseDouble(details[3]),Double.parseDouble(details[4]));
            employees[i] = employee;
        }
            i++;
    }
        for (Employee emp  : employees){
            System.out.println(emp);
        }}
}
