package Module2;

public class Bike extends Vehicle{
    Bike(String regNo,String brand,double baseRate){
        super(regNo,brand,baseRate);
        super.baseRate = baseRate*1.2;
    }

    @Override
    public  String  toString(){
        return "Bike " + this.regNo + " " +  this.brand + " Rent: " +  this.baseRate;
    }
}
