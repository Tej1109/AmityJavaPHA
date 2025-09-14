package Module2;
import java.util.Scanner;

public class Question4 {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter Order ID : ");
         String ordId = scanner.nextLine();
         System.out.print("Enter number of products: ");
         int numProd = scanner.nextInt();
         scanner.nextLine();


         Product[] prods = new Product[numProd];

         for (int i = 0; i < numProd; i++){
             System.out.println("Enter the product details : Name,Price,Qty ");
             String[] prodDetails = scanner.nextLine().split(",");
             prods[i] = new Product(prodDetails[0],Double.parseDouble(prodDetails[1]),Integer.parseInt(prodDetails[2]));
         }

         Order order = new Order(ordId,prods);
         System.out.println(order);


     }
}
