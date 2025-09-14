package Module2;

public class DomesticFlight extends Flight{
    DomesticFlight(String flightNumber, String flight, double fare){
        super(flightNumber,flight,fare);
    }



    @Override
    double calculateFare(){
        double fare = getFare();
    return fare + 0.10*fare;}
}
