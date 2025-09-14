package Module2;

import java.util.Scanner;

public class PHA_M2_Q5 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Person person;
        System.out.println("Enter details: ");
        String[] details = scanner.nextLine().split(",");

        if (details.length == 4){
            person = new Surgeon(details[0],Integer.parseInt(details[1]),details[2],details[3]);
            System.out.println(person);
        }
        else if (details.length == 3) {
            person = new Doctor(details[0],Integer.parseInt(details[1]),details[2]);
            System.out.println(person);

        } else if (details.length == 2) {
            person = new Person(details[0],Integer.parseInt(details[1]));
            System.out.println(person);}
        else {
            System.out.println("Details format doesnt match");
        }
    }

}
