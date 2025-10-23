package Module3;

import java.util.Scanner;

public class PHA_M3_Q9 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Start Simulation\n2.Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        if (choice == 1){
        IoTSensor iot = new IoTSensor();
        RandGen randGen = new RandGen(iot);
        OddCalc oddCalc = new OddCalc(iot);
        EvenCalc evenCalc = new EvenCalc(iot);

        randGen.t.start();
        evenCalc.t.start();
        oddCalc.t.start();
        }
        else {
            System.out.println("You exited successfully");
        }

    }}
