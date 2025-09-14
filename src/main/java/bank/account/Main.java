package bank.account;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("A1001", 10.0, "1234");
        System.out.println("Balance: " + myAccount.getBalance());

        myAccount.deposit(50);
        System.out.println("Balance after deposit: " + myAccount.getBalance());

        myAccount.withdraw(30, "1234");
        System.out.println("Balance after withdraw: " + myAccount.getBalance());

        myAccount.withdraw(200, "1234"); // not enough funds
        myAccount.withdraw(10, "0000"); // wrong PIN

        // Full constructor
        Account acc1 = new Account("A1001", 100.0, "1234");
        System.out.println("Acc1 balance: " + acc1.getBalance());

        // Default constructor
        Account acc2 = new Account();
        System.out.println("Acc2 balance: " + acc2.getBalance());

        // Copy constructor
        Account acc3 = new Account(acc1);
        System.out.println("Acc3 balance (copy of Acc1): " + acc3.getBalance());

        System.out.println("\n=== Operations ===");
        acc1.deposit(25);
        acc1.withdraw(30, "1234");   // correct PIN
        acc1.withdraw(500, "1234");  // too large
        acc1.withdraw(10, "0000");   // wrong PIN

        System.out.println("\nFinal states:");
        System.out.println("a1 -> " + acc1);
        System.out.println("a2 -> " + acc1);
        System.out.println("a3 -> " + acc1);
        System.out.println("a4 -> " + acc1);


    Account acc = new Account();
    // Try to set balance safely
        acc.setBalance(500);    // ✅ works
        acc.setBalance(-100);   // ❌ rejected
    // Read balance
        System.out.println("Balance is: " + acc.getBalance()); // prints 500
    }
}


