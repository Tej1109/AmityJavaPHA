package Module3;

public class TicketBooking {
    int availableSeats;
    TicketBooking(int availableSeats){
        this.availableSeats = availableSeats;
    }
    public synchronized boolean book(int seats){
        if (seats > this.availableSeats) {
            return false;
        }
        else {
            availableSeats -= seats;
            return true;
            }
        }
    }
