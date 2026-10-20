class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber number) {
        double newReal = real + number.real;
        double newImaginary = imaginary + number.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class Practical5 {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(4.5, 2.0);
        ComplexNumber second = new ComplexNumber(1.5, -5.0);

        ComplexNumber answer = first.add(second);

        System.out.print("First number: ");
        first.display();

        System.out.print("Second number: ");
        second.display();

        System.out.print("Sum: ");
        answer.display();
    }
}

