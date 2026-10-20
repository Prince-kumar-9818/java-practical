interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printer is printing.");
    }

    public void scan() {
        System.out.println("Printer is scanning.");
    }
}

class Machine {
    public void start() {
        System.out.println("Machine is starting.");
    }
}

// HybridPrinter extends one class and implements two interfaces.
class HybridPrinter extends Machine implements Printable, Scannable {
    public void print() {
        System.out.println("Hybrid printer is printing.");
    }

    public void scan() {
        System.out.println("Hybrid printer is scanning.");
    }
}

public class Practical3 {
    public static void main(String[] args) {
        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        HybridPrinter hybridPrinter = new HybridPrinter();
        hybridPrinter.start();
        hybridPrinter.print();
        hybridPrinter.scan();
    }
}

