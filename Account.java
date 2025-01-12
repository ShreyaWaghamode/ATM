package Main;

public class Account {
    private String accountNumber;
    private int pin;
    private double balance;

    /**
     * Constructor to initialize an Account object.
     *
     * @param accountNumber the account number
     * @param pin           the PIN for the account
     * @param initialBalance the initial balance of the account
     */
    public Account(String accountNumber, int pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = initialBalance;
    }

    /**
     * Gets the account number.
     *
     * @return the account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Verifies if the provided PIN matches the account PIN.
     *
     * @param pin the PIN to verify
     * @return true if the PIN matches, false otherwise
     */
    public boolean verifyPin(int pin) {
        return this.pin == pin;
    }

    /**
     * Gets the current balance of the account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Deposits a specified amount into the account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * Withdraws a specified amount from the account if sufficient balance exists.
     *
     * @param amount the amount to withdraw
     * @return true if the withdrawal is successful, false otherwise
     */
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
        return false;
    }
}
