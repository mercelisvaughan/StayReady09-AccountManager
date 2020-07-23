package com.codedifferently.bankaccountlab;

public abstract class BankAccount {

    private Integer accountNumber;
    private Double fees = 0.0;
    private String name = "";
    private Double balance = 0.0;


    public BankAccount(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.fees = fees;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(Double n){
        this.balance += n;
    }

    public void withdraw(Double n){
        if (n > this.balance){
            System.out.println("Chill, you'll go into the negative.");
        }
        this.balance -= n;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
