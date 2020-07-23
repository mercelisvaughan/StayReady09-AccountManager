package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class BusinessAccountTest {

    @Test
    public void businessAccountConstructorTest(){
        // Given
        BusinessAccount businessAccount = new BusinessAccount(0000, "VersaTech", 987, "pop");
        // When
        String compName = "VersaTech";
        String actual = businessAccount.getCompanyName(); // Comp Name Test
        // Then
        Assert.assertEquals(compName, actual);

        // When --> Account Number Test
        Integer acctNum = 0000;
        Integer actualAcctNum = businessAccount.getAccountNumber();
        // Then
        Assert.assertEquals(acctNum, actualAcctNum);

        // When --> Tax ID Test
        Integer taxIdnum = 987;
        Integer actualTaxIdNum = businessAccount.getTaxId();
        // Then
        Assert.assertEquals(taxIdnum, actualAcctNum);
    }

    @Test
    public void getCompanyNameTest(){
        // Given
        BusinessAccount b = new BusinessAccount(0000, "TechCompany", 555, "lop");
        // When
        String expected = "TechCompany";
        String actual = b.getCompanyName();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setCompanyNameTest(){
        // Given
        BusinessAccount b = new BusinessAccount(0000, "", 667, "yo");
        // When
        b.setCompanyName("Name");
        String expected = "Name";
        String actual = b.getCompanyName();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTaxIdTest(){
        // Given
        BusinessAccount b = new BusinessAccount(0000, "", 0, "po");
        // When
        b.setTaxId(90210);
        Integer expected = 90210;
        Integer actual = b.getTaxId();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTaxIdTest(){
        // Given
        BusinessAccount b = new BusinessAccount(00, "", 0, "lop");
        // When
        Integer expected = 0;
        Integer actual = b.getTaxId();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAcctNumTest(){
        // Given
        BusinessAccount b = new BusinessAccount(0000, "", 0, "lsksa");
        // When
        b.setAccountNumber(2121);
        Integer expected = 2121;
        Integer actual = b.getAccountNumber();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAcctNumTest(){
        // Given
        BusinessAccount b = new BusinessAccount(0000, "", 0, "mdip");
        // When
        Integer expected = 0000;
        Integer actual = b.getAccountNumber();
        // Then
        Assert.assertEquals(expected, actual);
    }
}
