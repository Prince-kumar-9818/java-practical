// SINGLE INHERITANCE 
class Vehicle {
    String brand = "Toyota";

    public void startEngine() {
        System.out.println("The vehicle engine has started.");
    }
}

class Car extends Vehicle {
    String model = "Camry";

    public void displayCarDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");
        Car myCar = new Car();
        myCar.startEngine();
        myCar.displayCarDetails();
    }
}
