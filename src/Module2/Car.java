package Module2;

public class Car extends Vehicle {
    Car(String regNo,String brand,double baseRate){
        super(regNo,brand,baseRate);
        super.baseRate = baseRate*1.5;
    }

    @Override
    public  String  toString(){
        return "Car " + this.regNo + " " +  this.brand + " Rent: " +
                this.baseRate;
    }
}
