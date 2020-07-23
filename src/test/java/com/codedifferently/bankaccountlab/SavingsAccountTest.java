package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class SavingsAccountTest {

    @Test
    public void savingConstructorTest(){
        // Given
        SavingsAccount savings = new SavingsAccount(001, "Urameshi", "password");
        // When --> Account Number Test
        Integer acctNum = 001;
        Integer actualAcctNum = savings.getAccountNumber();
        // Then
        Assert.assertEquals(acctNum, actualAcctNum);

        // When --> Name Test
        String expected = "Urameshi";
        String actual = savings.getName();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFeeTest(){
        // Given
        SavingsAccount s = new SavingsAccount(000, "Lucky", "pop");
        // When
        s.setFee(1.2);
        Double expected = 1.2;
        Double actual = s.getFee();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFeeTest(){
        // Given
        SavingsAccount s = new SavingsAccount(00, "Aname", "mypassword");
        // When
        s.setFee(22.0);
        Double expected = 22.0;
        Double actual = s.getFee();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void depositTest(){
        // Given
        SavingsAccount s = new SavingsAccount(00, "Myname", "mypass");
        // When
        s.deposit(500.0);
        Double expected = 500.0;
        Double actual = s.getBalance();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withdrawTest(){
        // Given
        SavingsAccount c = new SavingsAccount(0, "Cell", "myCell");
        // When
        c.deposit(1000.0);
        Double expected = 500.0;
        c.withdraw(500.0);
        Double actual = c.getBalance();
        // Then
        Assert.assertEquals(expected, actual);

    }

}
