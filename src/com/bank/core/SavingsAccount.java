package com.bank.core;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Cannot withdraw. Minimum balance of N100 required.");
        }
    }

    @Override
    public void transfer(double amount, BankAccount destination) {
        if (balance >= amount) {
            balance -= amount;
            destination.deposit(amount);
            System.out.println("Transferred: " + amount + " to " + destination.accountNumber + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}
