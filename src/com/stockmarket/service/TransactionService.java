package com.stockmarket.service;

import java.util.List;

import com.stockmarket.model.Transaction;
import com.stockmarket.util.FileManager;

public class TransactionService {
    // Log a transaction (buy or sell)
    public void logTransaction(Transaction transaction) {
        FileManager.saveTransaction(transaction); // Save the transaction to file
    }

    // View transaction history
    public void viewTransactionHistory(List<Transaction> transactions) {
        System.out.println("Transaction History:");
        for (Transaction t : transactions) {
            System.out.println(t.getDateTime() + " - " + t.getType() + " " + t.getQuantity() + " shares of " + t.getStock().getCompanyName() + " (" + t.getStock().getSymbol() + ")");
        }
    }
}
