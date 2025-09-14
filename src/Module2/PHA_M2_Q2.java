// if multiple is asked here, we can always just put this in a loop
package Module2;

import java.util.Scanner;

public class PHA_M2_Q2 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
        Flight flight;
        System.out.println("Enter flight type,number,airline,fare");
        String[] details = scanner.nextLine().split(",");

        if (details[0].equalsIgnoreCase("Domestic")){
            flight = new DomesticFlight(details[1],details[2],Double.parseDouble(details[3]));
            System.out.println(flight);
        } else if (details[0].equalsIgnoreCase("International")) {
            flight = new InternationalFlight(details[1],details[2],Double.parseDouble(details[3]));
            System.out.println(flight);
        }
        else {
            System.out.println("Wrong flight type entered, code will not work");

        }
        System.out.print("Do you want to continue : Yes/No ");
        choice = scanner.nextLine();
        }while (!choice.equalsIgnoreCase("No"));
        System.out.println("Thanks for using our program!");



    }
}
