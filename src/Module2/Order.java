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
        String temp = "";
        for (Product prod : products){
            temp += prod.toString()+"\n";
        }
    return  "Order ID :"  + this.orderId + "\n" + "Products : \n" + temp + "Total : " + calculateTotal();
}}
