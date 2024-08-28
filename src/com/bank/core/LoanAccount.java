package com.bank.core;

import com.bank.interfaces.Loanable;

public class LoanAccount implements Loanable {
    private double loanAmount;
    private double interestRate;

    public LoanAccount(double interestRate) {
        this.interestRate = interestRate;
        this.loanAmount = 0;
    }

    @Override
    public void applyLoan(double amount) {
        loanAmount += amount;
        System.out.println("Loan applied: " + amount + " | Total Loan Amount: " + loanAmount);
    }

    @Override
    public void payLoan(double amount) {
        if (loanAmount >= amount) {
            loanAmount -= amount;
            System.out.println("Loan repayment: " + amount + " | Remaining Loan Amount: " + loanAmount);
        } else {
            System.out.println("Overpayment. Please check the amount.");
        }
    }

    public void applyInterest() {
        loanAmount += loanAmount * interestRate;
        System.out.println("Interest applied. New Loan Amount: " + loanAmount);
    }

    public double getLoanAmount() {
        return loanAmount;
    }
}
