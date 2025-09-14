package bank.account;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    // new class for customers with multiple accounts
    private String name; // 'internals'
    private String customerId;
    private List<Account> accounts;  // list of accounts owned by the customer


    // === Constructors ===

    // 1) Full constructor (you pass everything explicitly)
    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>(); // start with an empty list of accounts

        System.out.println("[Constructor] Customer created -> " + this.name + " (ID: " + this.customerId + ")");
    }

    // 2) Overloaded constructor (auto-generate ID if not provided)
    public Customer(String name) {
        // call the full constructor with an auto-generated ID
        this(name, generateCustomerId());
    }

    // Helper method to auto-generate a customer ID
    private static String generateCustomerId() {
        // In a real bank this might query a database or use UUIDs
        return "CUST" + System.currentTimeMillis(); // current time in ms = unique
    }

    // === Behaviors (methods) ===

    // Add an account to this customer
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account " + account.getAccountNumber() + " added to customer " + this.name);
    }

    // Show all accounts owned by this customer
    public void listAccounts() {
        System.out.println("Accounts for " + this.name + ":");
        if (accounts.isEmpty()) {
            System.out.println("  (no accounts yet)");
        } else {
            for (Account acc : accounts) {
                System.out.println("  - " + acc); // uses Account’s toString()
            }
        }
    }

    // Getter for customer name
    public String getName() {
        return name;
    }

    // Getter for customer ID
    public String getCustomerId() {
        return customerId;
    }

    // A nice toString() so we can print Customer objects easily
    @Override
    public String toString() {
        return String.format("Customer{name='%s', id='%s', accounts=%d}",
                name, customerId, accounts.size());
    }





}
