package com.stockmarket.model;

import java.util.List;

public class User {
    private String username;
    private String password;  // Hashed password
    private double balance;
    private List<Portfolio> portfolio;

    // Constructor
    public User(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Portfolio> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(List<Portfolio> portfolio) {
        this.portfolio = portfolio;
    }
}
