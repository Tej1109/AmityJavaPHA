package Module3;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class PHA_M3_Q7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Seats: ");
        TicketBooking t= new TicketBooking(scanner.nextInt());
        System.out.println("User1 wants to book: ");
        User1 user1 = new User1(t,scanner.nextInt());
        System.out.println("User2 wants to book: ");
        User2 user2 = new User2(t,scanner.nextInt());
        user1.start();
        user2.start();

    }
}
