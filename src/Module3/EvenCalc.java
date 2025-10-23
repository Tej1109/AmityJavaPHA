package Module3;

public class EvenCalc implements Runnable {
    IoTSensor iot;
    Thread t;

    EvenCalc(IoTSensor iot){
        this.iot = iot;
        t = new Thread(this);

    }

    @Override
    public void run(){
        while (true) iot.evenCalculator();
    }
}
