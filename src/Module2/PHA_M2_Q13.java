package Module2;

import java.util.Scanner;

public class PHA_M2_Q13 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Reservation details: ");
        String[] reservationDetails = scanner.nextLine().split(",");

        n = Integer.parseInt(reservationDetails[2]);

        Guest[] guests = new Guest[n];

        for (int i = 0;i < n; i++ ){
            System.out.printf("Enter Guest %d details: ",i+1);
            String[] guestDetails = scanner.nextLine().split(",");
            guests[i] = new Guest(guestDetails[0],Integer.parseInt(guestDetails[1]),guestDetails[2]);
        }

        Reservation reservation= new Reservation(reservationDetails[0],reservationDetails[1],guests);
        System.out.println(reservation);

    }
}
