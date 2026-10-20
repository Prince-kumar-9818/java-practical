class Book {
    String title;
    String author;
    double price;

    // No-argument constructor
    Book() {
        title = "No title";
        author = "No author";
        price = 0.0;
    }

    // Constructor with values
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy constructor
    Book(Book other) {
        title = other.title;
        author = other.author;
        price = other.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Practical6 {
    public static void main(String[] args) {
        Book firstBook = new Book();
        Book secondBook = new Book("Java Basics", "R. Shah", 400.0);
        Book copiedBook = new Book(secondBook);

        System.out.println("Book made with no-argument constructor:");
        firstBook.display();

        System.out.println("\nOriginal book:");
        secondBook.display();

        copiedBook.title = "Java Basics - New Edition";

        System.out.println("\nOriginal after changing the copy:");
        secondBook.display();

        System.out.println("\nChanged copy:");
        copiedBook.display();
    }
}
