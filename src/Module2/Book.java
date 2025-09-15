package Module2;

public class Book {
    String title;
    Double price;
    Author author;

    Book(String title, Double price,String name,String email, char gender){
        this.title = title;
        this.price = price;
        this.author = new Author(name,email,gender);
    }

    @Override
    public  String  toString(){
      return "Book : " + title + "\nPrice: " + price + "\nAuthor: " + this.author.getDetails();
    }
}
