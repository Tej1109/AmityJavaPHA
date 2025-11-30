package Module2;

import java.util.Scanner;

public class PHA_M2_Q6 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details: ");
        String[] details = scanner.nextLine().split(",");
        Book book = new Book(details[0],Double.parseDouble(details[1]) ,details[2],details[3],details[4].charAt(0));
        System.out.println(book);}

}
