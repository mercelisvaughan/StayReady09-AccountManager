package com.codedifferently.bankaccountlab;

public class CheckingAccount extends BankAccount{

    private Double fees;
    private String password;

    public CheckingAccount(int accountNumber, String name, String password) {
        super(accountNumber, name);
        this.fees = fees;
        this.password = password;
    }

    public void setFeeRate(Double f){
        this.fees = fees;
    }

    public Double getFeeRate(){
        return fees;
    }

}
