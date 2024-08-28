package com.bank.core;

public abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public abstract void withdraw(double amount);

    public abstract void transfer(double amount, BankAccount destination);

    public double getBalance() {
        return balance;
    }

    public void rechargeAirtime(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Recharged airtime of: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to recharge airtime.");
        }
    }
}
