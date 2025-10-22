package Module3;

public class PrinterJob implements Runnable{
    Thread t;
    static int counter = 0;

    PrinterJob(String name){
         t = new Thread(this,name);
    }

    static synchronized void print(String name){
        System.out.println("Printing job " + (counter+1) + " by " + name);
        try{Thread.sleep(2000);}
        catch(InterruptedException e){
            System.out.println("Interrupt");
        };
    }

    @Override
    public void run(){
            PrinterJob.print(this.t.getName());
            counter++;
    }
}
