package com.stockmarket.service;

public class PortfolioService {
    // Buy stocks and add them to the user's portfolio
    public void buyStock(Portfolio portfolio, Stock stock, int quantity, double availableBalance) throws Exception {
        double cost = stock.getCurrentPrice() * quantity;
        if (cost > availableBalance) {
            throw new Exception("Insufficient balance to buy stock.");
        }
        portfolio.addStock(stock, quantity);
    }

    // Sell stocks and remove them from the user's portfolio
    public void sellStock(Portfolio portfolio, Stock stock, int quantity) throws Exception {
        if (!portfolio.getStocks().containsKey(stock) || portfolio.getStocks().get(stock) < quantity) {
            throw new Exception("Insufficient quantity to sell.");
        }
        portfolio.removeStock(stock, quantity);
    }

    // View portfolio
    public void viewPortfolio(Portfolio portfolio) {
        System.out.println("Your Portfolio:");
        for (Stock stock : portfolio.getStocks().keySet()) {
            int qty = portfolio.getStocks().get(stock);
            System.out.println(stock.getCompanyName() + " (" + stock.getSymbol() + "): " + qty + " shares");
        }
    }
}
