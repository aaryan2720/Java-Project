package com.stockmarket.service;

import java.util.Map;
import java.util.Random;

import com.stockmarket.model.Stock;

public class StockMarketService {
    private Map<String, Stock> availableStocks;

    public StockMarketService(Map<String, Stock> availableStocks) {
        this.availableStocks = availableStocks;
    }

    // Simulate stock price changes
    public void updateStockPrices() {
        Random rand = new Random();
        for (Stock stock : availableStocks.values()) {
            double change = rand.nextDouble() * 10 - 5; // Random price change between -5 and +5
            stock.setCurrentPrice(stock.getCurrentPrice() + change);
        }
    }

    // Display available stocks and their prices
    public void displayStocks() {
        System.out.println("Available Stocks:");
        for (Stock stock : availableStocks.values()) {
            System.out.println(stock.getCompanyName() + " (" + stock.getSymbol() + "): $" + stock.getCurrentPrice());
        }
    }

    // Get a specific stock by its symbol
    public Stock getStock(String symbol) {
        return availableStocks.get(symbol);
    }
}
