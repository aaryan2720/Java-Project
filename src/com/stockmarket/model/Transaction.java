package com.stockmarket.model;

import java.time.LocalDateTime;

public class Transaction {
    private String username;
    private Stock stock;
    private int quantity;
    private String type;  // "buy" or "sell"
    private LocalDateTime dateTime;

    public Transaction(String username, Stock stock, int quantity, String type) {
        this.username = username;
        this.stock = stock;
        this.quantity = quantity;
        this.type = type;
        this.dateTime = LocalDateTime.now();
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public Stock getStock() {
        return stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
