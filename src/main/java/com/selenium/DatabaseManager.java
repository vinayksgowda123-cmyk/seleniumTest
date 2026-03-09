package com.selenium;

public class DatabaseManager {
    private static volatile DatabaseManager instance;

    private DatabaseManager() {
        System.out.println("DatabaseManager instance created.");
    }
    public static DatabaseManager getInstance() {
        if (instance == null) {
            synchronized (DatabaseManager.class) {
                if (instance == null) {
                    instance = new DatabaseManager();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Connecting to the database...");
    }
}

