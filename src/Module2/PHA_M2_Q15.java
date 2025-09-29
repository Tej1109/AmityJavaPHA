package Module2;

import java.util.Scanner;

public class PHA_M2_Q15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Citizen and Passport details: ");
        String[]  citizenDetails = scanner.nextLine().split(",");
        String[]  passportDetails = scanner.nextLine().split(",");

        Citizen citizen = new Citizen(citizenDetails[0],citizenDetails[1],
                citizenDetails[2],passportDetails[0],passportDetails[1],passportDetails[2]);
        System.out.println(citizen);
    }
}
