package com.codedifferently.bankaccountlab;

public class BusinessAccount extends BankAccount{

    private String companyName;
    private Integer taxId;
    private Integer accountNumber;

    public BusinessAccount(Integer accountNumber, String companyName, Integer taxId, String password) {
        super(accountNumber, companyName);
        this.companyName = companyName;
        this.taxId = taxId;
        this.accountNumber = accountNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    @Override
    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}

