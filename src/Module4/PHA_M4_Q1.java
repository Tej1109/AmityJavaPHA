package Module4;

import java.util.ArrayList;
import java.util.Scanner;

public class PHA_M4_Q1 {
    static ArrayList<String> books = new ArrayList<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Library");
        int choice;
        do {
            System.out.println("1. Add Book\n" +
                    "2. Remove Book\n" +
                    "3. Display All Books\n" +
                    "4. Exit");
            System.out.println("Enter choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 ->{
                    System.out.println("Enter book title: ");
                    String book = scanner.nextLine();
                    addBook(book);
                }
                case 2 ->{
                    System.out.println("Enter book title removed");
                    String book = scanner.nextLine();
                    removeBook(book);
                }

                case 3 -> displayBooks();
            }
        } while (choice!=4);
        System.out.println("Thanks for using!");
    }
    static void addBook(String book){
        books.add(book);
        System.out.println("Book " + book  + " added");
    }

    static void removeBook(String book){
        books.remove(book);
        System.out.println("Book " + book + " removed");
    }

    static void displayBooks(){
        System.out.println("Current Books");
        for (String book : books){
            System.out.println(book);
        }
    }
}
