package com.stockmarket;

import com.stockmarket.view.UserInterface;

public class Main {
    public static void main(String[] args) {
        // Starting point of the application
        System.out.println("Welcome to the Stock Market Simulator!");

        // Initialize the User Interface
        UserInterface ui = new UserInterface();
        ui.start();
    }
}
