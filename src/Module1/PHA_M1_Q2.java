package Module1;/*
Write a Java program that:
• Stores an integer value for temperature in Celsius.
• Converts it to Fahrenheit using the formula F = (C × 9/5) + 32.
• Displays both Celsius and Fahrenheit values.
 */
import  java.util.Scanner;
public class PHA_M1_Q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your temperature in Celsius: ");
        int tempCelsius = scanner.nextInt();
        double tempFahrenheit = (tempCelsius * 1.8) + 32;
        System.out.printf("Temperature in Celsius is: %02d°C \n", tempCelsius);
        System.out.printf("Temperature in Fahrenheit is: %.2f°F ", tempFahrenheit);

        scanner.close();
    }
}
