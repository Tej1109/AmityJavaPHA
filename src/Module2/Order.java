package Module2;
public class Order {
    String  orderId ;
    Product[] products;

    Order(String orderId,Product[] products){
        this.orderId = orderId;
        this.products = products;
    }

    public double calculateTotal(){
        double total = 0;
        for (Product prod : products ){
            total += prod.price * prod.quantity ;
        }
    return  total;}

    @Override
    public  String toString(){
        System.out.println("Order ID : "  + this.orderId);
        System.out.println("Products : ");
        for (Product prod : products){
            System.out.println(prod);
        }
        System.out.println("Total : " + calculateTotal());
    return  "";}
}
