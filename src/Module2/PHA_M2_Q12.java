package Module2;


import java.util.Scanner;

public class PHA_M2_Q12 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Details: ");
        String[] detail_arr = scanner.nextLine().split(",");
        Vehicle vehicle;

        if (detail_arr[0].equalsIgnoreCase("Car")){
            vehicle = new Car(detail_arr[1],detail_arr[2],Double.parseDouble(detail_arr[3]));
            System.out.println(vehicle);
        }
        else if (detail_arr[0].equalsIgnoreCase("Bike")){
            vehicle = new Bike(detail_arr[1],detail_arr[2],Double.parseDouble(detail_arr[3]));
            System.out.println(vehicle);
        }
        else{
            System.out.println("Wrong Input Format");
        }

    }
}
