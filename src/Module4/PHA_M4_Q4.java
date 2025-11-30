package Module4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import  java.util.Scanner;
public class PHA_M4_Q4   {
    static HashMap<Integer,Integer> products = new HashMap<>();
    public static void main(String[] args){
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add Product ID\n" +
                "2. Update Stock\n" +
                "3. Display Inventory\n" +
                "4. Exit");
        do{
            System.out.println("Enter Choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> {
                    System.out.println("Enter Product ID: ");
                    int prod = scanner.nextInt();
                    System.out.println("Enter Stock");
                    int stock = scanner.nextInt();
                    products.put(prod,stock);
                    System.out.println("Added product successfully!");
                }
                case 2 -> {
                    System.out.println("Enter Product ID");
                    int prod = scanner.nextInt();
                    if (products.containsKey(prod)) {
                        System.out.println("Enter Updated Stock");
                        int stock = scanner.nextInt();
                        products.replace(prod, stock);
                        System.out.println("Updated Successfully!");
                    }
                else {
                        System.out.println("There's no matching product!");
                }
                }

                case 3 ->{
                    System.out.println("List of Products");
                    Iterator<Map.Entry<Integer,Integer>> iterator = products.entrySet().iterator();

                    while (iterator.hasNext()){
                        Map.Entry<Integer,Integer> entry = iterator.next();
                        System.out.println("Product_id : " + entry.getKey() +
                                "     Stock : " + entry.getValue());
                    }
                }
                case 4 -> {
                    System.out.println("Thanks for using our program!");
                }
                default -> {
                    System.out.println("You have entered the wrong value!");
                }
        }
        }while (choice!=4);
    }}
