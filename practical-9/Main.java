class PayrollEmployee {
    String name;
    double salary;
    static int employeeCount = 0;

    PayrollEmployee() {
        this("Not assigned", 0.0);
    }

    PayrollEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    static void displayCount() {
        System.out.println("Employees created: " + employeeCount);
    }
}

public class Practical9 {
    public static void main(String[] args) {
        PayrollEmployee first = new PayrollEmployee();
        PayrollEmployee second = new PayrollEmployee("Asha", 25000.0);
        PayrollEmployee third = new PayrollEmployee("Ravi", 30000.0);

        first.display();
        second.display();
        third.display();

        PayrollEmployee.displayCount();
    }
}

