package org.example.kata;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

