package Module2;

public class PHA_M2_Q10 {
    public static void main(String[] args) {
        Device[] devices = {new Fan(), new Light()};

        for (Device device : devices){
            device.turnOn();
            device.turnOff();
        }
    }
}
