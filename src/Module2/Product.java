package Module2;
public class Product {
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return productName +  " x " + quantity + " = " + "₹" + (price*quantity);

    }
}
