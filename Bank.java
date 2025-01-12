package Main;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account authenticate(String accountNumber, int pin) {
        Account account = accounts.get(accountNumber);
        if (account != null && account.verifyPin(pin)) {
            return account;
        }
        return null;
    }
}
