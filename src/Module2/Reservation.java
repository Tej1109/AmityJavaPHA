package Module2;

public class Reservation {
    String reservationId;
    String roomType;
    Guest[] guests;

    Reservation(String reservationId,String roomType, Guest[] guests){
        this.reservationId = reservationId;
        this.roomType = roomType;
        this.guests = guests;
    }

    @Override
    public  String toString(){
        String rDetails = "Reservation ID : " + this.reservationId + " Room : " + roomType;
        String gDetails = "\nGuests: \n" ;
        for (Guest g : guests){
            gDetails += g.getDetails() + "\n";
        }
        return  rDetails + gDetails;
    }
}
