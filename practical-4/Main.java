class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class PayEmployee {
    String name;

    PayEmployee(String name) {
        this.name = name;
    }

    double calculatePay() {
        return 0.0;
    }
}

class HourlyEmployee extends PayEmployee {
    double rate;
    int hours;

    HourlyEmployee(String name, double rate, int hours) {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    double calculatePay() {
        return rate * hours;
    }
}

class SalariedEmployee extends PayEmployee {
    double salary;

    SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    double calculatePay() {
        return salary;
    }
}

public class Practical4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Adding two integers: " + calculator.add(4, 6));
        System.out.println("Adding three integers: " + calculator.add(1, 2, 3));
        System.out.println("Adding two decimals: " + calculator.add(2.5, 3.5));

        PayEmployee firstEmployee = new HourlyEmployee("Asha", 200.0, 8);
        PayEmployee secondEmployee = new SalariedEmployee("Ravi", 30000.0);

        System.out.println(firstEmployee.name + " pay: " + firstEmployee.calculatePay());
        System.out.println(secondEmployee.name + " pay: " + secondEmployee.calculatePay());
    }
}

