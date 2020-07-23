package com.codedifferently.bankaccountlab;

public class SavingsAccount extends BankAccount{

    private Double fees;
    private Double rate;
    private String password;

    public SavingsAccount(int accountNumber, String name, String password) {
        super(accountNumber, name);
        this.fees = fees;
        this.password = password;
        this.rate = rate;
    }

    public String getPassword(){
        return this.password;
    }

    public void setFee(Double d){
        this.fees = fees;
    }
    public Double getFee(){
        return fees;
    }
    public void setRate(Double d){
        this.rate = rate;
    }
    public Double getRate(){
        return rate;
    }
}
