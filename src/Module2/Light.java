package Module2;

public class Light implements  Device{

    @Override
    public void turnOn(){
        System.out.println("Light is now ON");
    }

    public void turnOff(){
        System.out.println("Light is now OFF");
    }
}

