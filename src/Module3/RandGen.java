package Module3;

public class RandGen implements Runnable{
    Thread t;
    IoTSensor iot;
    RandGen(IoTSensor iot){
        this.iot = iot;
        t = new Thread(this);
    }

    @Override
    public void run(){
        try {
            while (true){
                Thread.sleep(1000);
                iot.generator();
            }
        } catch (InterruptedException e){
            System.out.println("Caught exception");
        }
    }
}
