class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }

        balance = balance + amount;
        return true;
    }

    boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }

        balance = balance - amount;
        return true;
    }
}

public class Practical10 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Mina Patel", "123456", 1000.0);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Account number: " + account.getAccountNumber());

        System.out.println("Deposit 500: " + account.deposit(500.0));
        System.out.println("Deposit -100: " + account.deposit(-100.0));
        System.out.println("Withdraw 0: " + account.withdraw(0.0));
        System.out.println("Withdraw 2000: " + account.withdraw(2000.0));
        System.out.println("Withdraw 200: " + account.withdraw(200.0));

        System.out.println("Updated balance: " + account.getBalance());
    }
}
