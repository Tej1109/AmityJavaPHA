package Module3;

import java.util.Random;

public class IoTSensor {
    int n ;
    boolean flag = false;
    static Random random = new Random();
    synchronized void generator(){
        while(flag){
            try{
            wait();
        }
        catch (InterruptedException e){
            System.out.println("Interrupt");}
        }
        int numberGenerated = random.nextInt(10);
        System.out.println("Generated " + numberGenerated);
        flag = true;
        this.n = numberGenerated;
        notifyAll();
    }

    synchronized void evenCalculator(){
        while(!flag || n%2!= 0){
            try {
                wait();

            }
            catch (InterruptedException e){
                System.out.println("Interrupt");
            }
        }
        flag = false;
        notifyAll();
        System.out.println("Squared : " + this.n * this.n);
    }
    synchronized void oddCalculator(){
        while(!flag || n%2 == 0){
            try {
                wait();

            }
            catch (InterruptedException e){
                System.out.println("Interrupt");
            }
        }
        flag = false;
        notifyAll();
        System.out.println("Cubed: " +  Math.pow(this.n,3));
    }
}
