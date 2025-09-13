package bank.account;

public class Account {
    public String accountNumber;
    private double balance;
    private String pin;


    // parametrized constructor - this lets us
    // create an object with specific values
    public Account(String accountNumber, double initialBalance, String pin) {
        this.accountNumber=accountNumber;
        this.balance=initialBalance;
        this.pin=pin;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount, String pin) {
        if (!this.pin.equals(pin)) {
            System.out.println("Wrong pin!");
            return false;
        }
        if (amount>balance) {
            System.out.println("Not enough funds.");
            return false;
        }

        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    // Test the class
    public static void main(String[] args) {
        Account acc = new Account("A1001", 100.0, "1234");
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(50);
        System.out.println("Balance after deposit: " + acc.getBalance());

        acc.withdraw(30, "1234");
        System.out.println("Balance after withdraw: " + acc.getBalance());

        acc.withdraw(200, "1234"); // not enough funds
        acc.withdraw(10, "0000"); // wrong PIN
    }
}
