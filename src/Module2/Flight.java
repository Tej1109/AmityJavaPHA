package Module2;

abstract class Flight {
    private String flightNumber;
    private String airline;
    private double fare;

    Flight(String flightNumber, String airline, double fare){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    String getFlightNumber(){
        return this.flightNumber;}

    String getAirline(){
        return  this.airline;}
    Double getFare(){
        return  this.fare;}

    @Override
    public String toString(){
        return "Flight No. : "+ this.flightNumber + " Airline : " + this.airline + " Fare : " +
                this.calculateFare();
    }
    abstract double calculateFare();
}
