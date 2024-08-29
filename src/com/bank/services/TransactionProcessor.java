package com.bank.services;

import com.bank.core.*;

public class TransactionProcessor {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", 1000); //Initial bank Savings account numbers and balance
        BankAccount current = new CurrentAccount("CA456", 500); //Initial bank Current account numbers and balance
        LoanAccount loan = new LoanAccount(0.05);

        // Deposits
        savings.deposit(200);
        current.deposit(300);

        // Withdrawals
        savings.withdraw(50);
        current.withdraw(600);

        // Transfers
        savings.transfer(100, current); // Intra-bank
        BankAccount otherBankAccount = new CurrentAccount("OB789", 400);
        current.transfer(50, otherBankAccount); // Inter-bank

        // Loan Application and Repayment
        loan.applyLoan(1000);
        loan.payLoan(200);
        loan.applyInterest();

        // Airtime Recharge
        savings.rechargeAirtime(100);
        current.rechargeAirtime(50);

        // Monthly Processing
        loan.applyInterest(); // Simulate end of month interest application

        // Print final balances and loan status
        System.out.println("Final Savings Account Balance: " + savings.getBalance());
        System.out.println("Final Current Account Balance: " + current.getBalance());
        System.out.println("Final Loan Amount: " + loan.getLoanAmount());
    }
}
