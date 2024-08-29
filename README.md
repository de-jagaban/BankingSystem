# BankingSystem
Simple CommandLine Banking System-COSC212 Java Assignment

# Scenario Overview:
Design a comprehensive banking system that handles various types of transactions such as deposits, withdrawals, 
transfers (both interbank and intrabank), loans, loan repayments, and airtime recharges. 
The system should leverage object-oriented principles such as inheritance, abstract classes, interfaces, polymorphism, and packages.


# Instructions:

```A. Class Structure:```

# Abstract Class:

* Create an abstract class BankAccount with the following properties:
```accountNumber (String)```
```balance (double)```

## Methods to implement:
```deposit(double amount) - deposits money into the account.```
```abstract withdraw(double amount) - withdraws money from the account.```
```abstract transfer(double amount, BankAccount destination) - transfers money to another account.```
```getBalance() - returns the current balance.```

# Subclasses: 

```SavingsAccount and CurrentAccount should inherit from BankAccount.```

## Implement the withdraw method:
```SavingsAccount ensures the balance doesn't drop below N100.```
```CurrentAccount allows overdraft with a N25 fee if the balance goes negative.```

## Implement the transfer method:
* Intra-bank transfers (within the same bank) should be free.
* Inter-bank transfers should charge a N5 fee.

## Interface:

* Create an interface Loanable with methods:
* applyLoan(double amount)
* payLoan(double amount)

* LoanAccount implements the Loanable interface and manages a loan account with properties:
* loanAmount (double)
* interestRate (double)

## Additional Functionality:

* AirtimeRecharge: Create a method rechargeAirtime(double amount) in the BankAccount class, allowing users to recharge airtime, reducing the balance by the specified amount.

# B. Packages:

* Organize your classes into packages:
* com.bank.core for the BankAccount, SavingsAccount, CurrentAccount, and LoanAccount classes.
* com.bank.interfaces for the Loanable interface.
* com.bank.services for a TransactionProcessor class that handles various banking services (deposit, withdraw, transfer, loan, payloan, recharge).


# C. Polymorphism:

* Use polymorphism to manage transactions involving different types of BankAccount objects (Savings, Current) and LoanAccount objects.

# D. Main Method:

* In the TransactionProcessor class, implement a main method that simulates the following scenarios:
* Deposits: Deposit money into different types of accounts.
* Withdrawals: Withdraw money from both savings and current accounts.

## Transfers:
* Intra-bank transfer between a savings account and a current account.
* Inter-bank transfer between a savings account in one bank and a current account in another.
* Loan Application and Repayment:
* Apply for a loan and process loan repayments.

## Airtime Recharge:
* Recharge airtime from any bank account.

### Monthly Processing:
* Simulate a monthly cycle where interest is applied to loans, and balances are updated.
* Print the final balances and loan statuses of all accounts.


```This comprehensive question set will allow you to explore a wide range of object-oriented programming concepts within a practical and complex banking system.```
