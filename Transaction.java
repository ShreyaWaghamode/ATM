package Main;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private List<String> transactionHistory;

    public Transaction() {
        transactionHistory = new ArrayList<>();
    }

    public void log(String message) {
        transactionHistory.add(message);
    }

    public void printHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transaction History:");
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
}
