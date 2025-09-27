package Module2;

public class Fan implements  Device{

    @Override
    public void turnOn(){
        System.out.println("Fan is now ON");
    }

    @Override
    public void turnOff(){
        System.out.println("Fan is now OFF");
    }
}
