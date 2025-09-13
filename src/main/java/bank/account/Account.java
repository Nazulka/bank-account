package bank.account;

public class Account {
    public String accountNumber;
    private double balance;
    private String pin;


    // parametrized full constructor - this lets us
    // create an object with specific values
    public Account(String accountNumber, double initialBalance, String pin) {
        this.accountNumber=accountNumber;
        this.balance=initialBalance;
        this.pin=pin;
    }

    // 2. default constructor
    public Account() {
        this.accountNumber = "0000";
        this.balance = 0.0;
        this.pin = "1234";
    }

    // cope constructor
    public Account(Account other) {
        this.accountNumber = other.accountNumber;
        this.balance = other.balance;
        this.pin = other.pin;
    }

    public void deposit(double amount) {
        balance += amount;  // shorthand: balance = balance - amount
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
}
