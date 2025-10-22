package Module3;


public class User1 extends Thread{
    TicketBooking t;
    int numTickets;
    User1(TicketBooking t, int numTickets){
        this.t = t;
        this.numTickets = numTickets;
    }
    @Override
    public void run(){
        if(t.book(numTickets)){
            System.out.println("User1 booked " + numTickets + " seat(s) successfully");}
        else {
            System.out.println("User1 booking failed. Not enough seats");
        }
    }
}
