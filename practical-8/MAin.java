class Product {
    String name;
    double price;
    int quantity;

    Product() {
        name = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    Product(String name) {
        this.name = name;
        price = 0.0;
        quantity = 0;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 1;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: " + totalCost());
        System.out.println();
    }
}

public class Practical8 {
    public static void main(String[] args) {
        Product first = new Product();
        Product second = new Product("Pencil");
        Product third = new Product("Notebook", 50.0);
        Product fourth = new Product("Bag", 700.0, 2);

        System.out.println("No-argument constructor:");
        first.display();

        System.out.println("Name-only constructor:");
        second.display();

        System.out.println("Name and price constructor:");
        third.display();

        System.out.println("Name, price and quantity constructor:");
        fourth.display();
    }
}
