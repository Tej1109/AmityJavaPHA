package Module3;

import java.util.Scanner;

public class User2 extends Thread{
    TicketBooking t;
    int numTickets;
    User2(TicketBooking t, int numTickets){
        this.t = t;
        this.numTickets = numTickets;
    }
    @Override
    public void run(){
        if(t.book(numTickets)){
            System.out.println("User2 booked " +  numTickets + " seat(s) successfully");}
        else {
            System.out.println("User2 booking failed. Not enough seats");
        }
    }
}
