package com.stockmarket.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.stockmarket.model.Transaction;
import com.stockmarket.model.User;

public class FileManager {

    // Load users from file
    public static Map<String, User> loadUsersFromFile() {
        Map<String, User> users = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data/users.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                User user = new User(details[0], details[1], Double.parseDouble(details[2]));
                users.put(details[0], user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    // Save users to file
    public static void saveUsersToFile(Map<String, User> users) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/users.txt"))) {
            for (User user : users.values()) {
                bw.write(user.getUsername() + "," + user.getPassword() + "," + user.getBalance());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Save transaction to file
    public static void saveTransaction(Transaction transaction) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/transactions.txt", true))) {
            bw.write(transaction.getUsername() + "," + transaction.getStock().getSymbol() + "," + transaction.getQuantity() + "," + transaction.getType() + "," + transaction.getDateTime());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
