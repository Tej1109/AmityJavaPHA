package Module3;

public class PHA_M3_Q8 {
    public static void main(String[] args){
        PrinterJob t1 = new PrinterJob("Student1");
        PrinterJob t2 = new PrinterJob("Student2");
        PrinterJob t3 = new PrinterJob("Student3");
        t1.t.start();
        t2.t.start();
        t3.t.start();
    }
}
