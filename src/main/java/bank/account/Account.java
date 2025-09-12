package bank.account;

public class Account {
    public String accountNumber;
    private double balance;
    private String pin;


    // parametrized constructor
    public Account(String accountNumber, double initialBalance, String pin) {
        this.accountNumber=accountNumber;
        this.balance=initialBalance;
        this.pin=pin;
    }

    public void deposit(double amount) {
        balance += amount;
    }


}
