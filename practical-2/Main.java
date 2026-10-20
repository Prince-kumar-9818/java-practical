class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " vehicle is starting.");
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    void showCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId;

    Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void showEmployeeId() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    void showDepartment() {
        System.out.println("Department: " + department);
    }
}

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    void showColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    void showArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle area: " + area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    void showArea() {
        double area = length * width;
        System.out.println("Rectangle area: " + area);
    }
}

public class Practical2 {
    public static void main(String[] args) {
        System.out.println("Single inheritance:");
        Car car = new Car("Toyota", "Corolla");
        car.start();
        car.showCarDetails();

        System.out.println();
        System.out.println("Multilevel inheritance:");
        Manager manager = new Manager("Asha", 101, "Sales");
        manager.showName();
        manager.showEmployeeId();
        manager.showDepartment();

        System.out.println();
        System.out.println("Hierarchical inheritance:");
        Circle circle = new Circle("Red", 2.0);
        circle.showColor();
        circle.showArea();

        Rectangle rectangle = new Rectangle("Blue", 4.0, 5.0);
        rectangle.showColor();
        rectangle.showArea();
    }
}
