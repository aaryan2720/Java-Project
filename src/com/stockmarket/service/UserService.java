package com.stockmarket.service;

import java.util.HashMap;
import java.util.Map;

import com.stockmarket.model.User;
import com.stockmarket.util.FileManager;

public class UserService {
    private Map<String, User> users;

    public UserService() {
        users = new HashMap<>();
        loadUsers();
    }

    // Register a new user
    public boolean register(String username, String password, double initialBalance) {
        if (users.containsKey(username)) {
            return false; // Username already exists
        }
        User newUser = new User(username, password, initialBalance);
        users.put(username, newUser);
        saveUsers();
        return true;
    }

    // Login a user by checking username and password
    public User login(String username, String password) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    // Get the user by username
    public User getUser(String username) {
        return users.get(username);
    }

    // Load users from file
    private void loadUsers() {
        users = FileManager.loadUsersFromFile(); // Assuming FileManager reads the users file and returns a Map
    }

    // Save users to file
    private void saveUsers() {
        FileManager.saveUsersToFile(users); // Assuming FileManager writes users to a file
    }
}
