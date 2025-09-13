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
    }

}

