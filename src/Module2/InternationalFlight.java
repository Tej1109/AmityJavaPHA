package Module2;

public class InternationalFlight extends Flight{
    InternationalFlight(String flightNumber, String flight, double fare){
        super(flightNumber,flight,fare);
    }



    @Override
    double calculateFare(){
        double fare = getFare();
        return fare + 0.25*fare;}
}
