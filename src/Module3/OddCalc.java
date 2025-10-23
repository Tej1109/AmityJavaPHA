package Module3;

public class OddCalc implements Runnable {
    IoTSensor iot;
    Thread t;

    OddCalc(IoTSensor iot){
        this.iot = iot;
        t = new Thread(this);

    }

    @Override
    public void run(){
        while (true) iot.oddCalculator();
    }
}
