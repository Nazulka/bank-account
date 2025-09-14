package bank.account;

public class Account {
    public String accountNumber;
    private double balance;
    private String pin;


    // parametrized full constructor - this lets us
    // create an object with specific values
    public Account(String accountNumber, double initialBalance, String pin) {
        this.accountNumber=accountNumber;  // left = field, right = parameter
        this.balance=initialBalance; // this.accountNumber → the field in the object being built.
        this.pin=pin; // accountNumber → the parameter you passed in.
    }

    // 2. default constructor
    public Account() {
        this.accountNumber = "0000";
        this.balance = 0.0;
        this.pin = "1234";
    }

    // copy constructor
    // The new constructors don’t need new names — they’re still called Account
    // (because constructors must have the same name as the class).
//    Java figures out which constructor to use by looking at the parameters you pass in

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

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("%s (bal=%.2f)", accountNumber, balance);
    }

    // Setter (controlled way to update balance)
    public void setBalance(double newBalance) {

        if (newBalance < 0) {  // enforce a rule: balance cannot be negative
            System.out.println("Balance cannot be negative!");
            return;
        }
        this.balance = newBalance;
    }
}
