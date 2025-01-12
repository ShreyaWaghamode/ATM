package Main;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create some accounts
        bank.addAccount(new Account("12345", 1234, 500.0));
        bank.addAccount(new Account("67890", 5678, 1000.0));

        // Create and start the ATM
        ATM atm = new ATM(bank);
        atm.start();
    }
}
