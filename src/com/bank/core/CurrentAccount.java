package com.bank.core;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        if (balance < 0) {
            balance -= 25; // Overdraft fee
            System.out.println("Overdraft fee applied.");
        }
        System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
    }

    @Override
    public void transfer(double amount, BankAccount destination) {
        if (balance >= amount) {
            balance -= amount;
            destination.deposit(amount);
            System.out.println("Transferred: " + amount + " to " + destination.accountNumber + " | New Balance: " + balance);
        } else if (balance + 5 >= amount) { // Inter-bank transfer fee
            balance -= amount + 5;
            destination.deposit(amount);
            System.out.println("Inter-bank transfer fee applied. Transferred: " + amount + " to " + destination.accountNumber + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}