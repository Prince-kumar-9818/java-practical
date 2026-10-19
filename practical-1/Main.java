class Student {
    int rollNumber;
    String name;
    int marks1;
    int marks2;
    int marks3;

    Student(int rollNumber, String name, int marks1, int marks2, int marks3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculatePercentage() {
        return calculateTotal() / 300.0 * 100;
    }

    void displayDetails() {
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total marks: " + calculateTotal() + " out of 300");
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println();
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Aarav", 85, 90, 88);
        Student student2 = new Student(2, "Diya", 92, 87, 95);
        Student student3 = new Student(3, "Kabir", 78, 82, 80);

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}

