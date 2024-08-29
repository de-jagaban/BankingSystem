package com.bank.core;

public abstract class BankAccount {
    protected String accountNumber; //Protect Account number from unauthorized class call.
    protected double balance; //Protect balance from unauthorized class call.

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //deposit(double amount) - deposits money into the account. 
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    //abstract withdraw(double amount) - withdraws money from the account.
    public abstract void withdraw(double amount);


    //abstract transfer(double amount, BankAccount destination) - transfers money to another account.
    public abstract void transfer(double amount, BankAccount destination);

    //This method returns the current balance after transfer has been made.
    public double getBalance() {
        return balance;
    }

    //This is the Airtime Recharge method that allows users to recharge airtime
    // First compare if the available account balance is greater or equal to the recharge amount using the if condition
    // Then process the airtime recharge if true else, print the insufficient balance message.    
    public void rechargeAirtime(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Recharged airtime of: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to recharge airtime.");
        }
    }
}
