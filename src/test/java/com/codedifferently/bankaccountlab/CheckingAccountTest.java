package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class CheckingAccountTest {

    @Test
    public void checkingConstructorTest(){
        // Given
        CheckingAccount checkings = new CheckingAccount(000, "Mercelis", "mypw");
        // When --> Account Number Test
        Integer acctNum = 000;
        Integer actualAcctNum = checkings.getAccountNumber();
        // Then
        Assert.assertEquals(acctNum, actualAcctNum);

        // When --> Name Test
        String expected = "Mercelis";
        String actual = checkings.getName();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void depositTest(){
        // Given
        CheckingAccount checking = new CheckingAccount(00, "Myname", "mypass");
        // When
        checking.deposit(500.0);
        Double expected = 500.0;
        Double actual = checking.getBalance();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withdrawTest(){
        // Given
        CheckingAccount c = new CheckingAccount(0, "Cell", "myCell");
        // When
        c.deposit(1000.0);
        Double expected = 500.0;
        c.withdraw(500.0);
        Double actual = c.getBalance();
        // Then
        Assert.assertEquals(expected, actual);

    }


}
