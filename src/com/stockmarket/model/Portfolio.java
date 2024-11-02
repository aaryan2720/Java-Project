package com.stockmarket.model;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private Map<Stock, Integer> stocks;

    public Portfolio() {
        stocks = new HashMap<>();
    }

    public void addStock(Stock stock, int quantity) {
        stocks.put(stock, stocks.getOrDefault(stock, 0) + quantity);
    }

    public void removeStock(Stock stock, int quantity) {
        if (stocks.containsKey(stock)) {
            int currentQty = stocks.get(stock);
            if (currentQty > quantity) {
                stocks.put(stock, currentQty - quantity);
            } else {
                stocks.remove(stock);
            }
        }
    }

    public Map<Stock, Integer> getStocks() {
        return stocks;
    }
}
