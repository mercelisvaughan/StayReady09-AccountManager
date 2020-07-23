package com.codedifferently.bankaccountlab;

import sun.tools.jconsole.inspector.XObject;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    // create, view, destroy
    private static ArrayList<BankAccount> acct = new ArrayList<BankAccount>();
    private static Scanner s = new Scanner(System.in);




    public void main(String[] args) {

        System.out.println("To create an account, enter " + " 1.");
        System.out.println("To view an account, enter " + " 2.");
        System.out.println("To delete an account, enter " + " 3.");

        if (s.nextInt() == 1){
            System.out.println("To create a business account, enter " + " 1.");
            System.out.println("To create a checkings account, enter " + " 2.");
            System.out.println("To create a savings account, enter " + " 3.");

            if (s.nextInt() == 1){
                createBusinessAcct();
            }
            if(s.nextInt() == 2){
                createChecking();
            }
            if (s.nextInt() == 3){
                createSavings();
            }

        }
        if (s.nextInt() == 2){
            viewAccounts();
        }
        if (s.nextInt() == 3){
            deleteFirstAccount();
        }

    }

    public void createBusinessAcct(){
        System.out.println("Enter your desired account number.");
        Integer accountNum = s.nextInt();

        System.out.println("Enter your business name.");
        String businessName = s.next();

        System.out.println("Enter your tax identification number.");
        Integer taxIdentification = s.nextInt();

        System.out.println("Enter your password.");
        String password1 = s.next();
        System.out.println("Enter your password again.");
        String password2 = s.next();

        String password = "";

        if (password1 == password2){
            password = password1;
        }
        else{
            System.out.println("Nope, start all over.");
        }

        BankAccount business = new BusinessAccount(accountNum, businessName, taxIdentification, password);
        System.out.println("Your account number is: " + accountNum);
        System.out.println("Your business is: " + businessName);
        System.out.println("Your tax ID number is: " + taxIdentification);
        System.out.println("Your password is: " + password);
        acct.add(business);
    }

    public void createChecking(){
        System.out.println("Enter your desired account number.");
        Integer accountNum = s.nextInt();

        System.out.println("Enter your name.");
        String name = s.next();

        System.out.println("Enter your password.");
        String password1 = s.next();
        System.out.println("Enter your password again.");
        String password2 = s.next();

        String password = "";

        if (password1 == password2){
            password = password1;
        }
        else{
            System.out.println("Nope, start all over.");
        }

        BankAccount checking = new CheckingAccount(accountNum, name, password);
        System.out.println("Your account number is: " + accountNum);
        System.out.println("You are: " + name);
        System.out.println("Your account number is: " + password);
        acct.add(checking);
    }

    public void createSavings() {
        System.out.println("Enter your desired account number.");
        Integer accountNum = s.nextInt();

        System.out.println("Enter your name.");
        String name = s.next();

        System.out.println("Enter your password.");
        String password1 = s.next();
        System.out.println("Enter your password again.");
        String password2 = s.next();

        String password = "";

        if (password1 == password2) {
            password = password1;
        } else {
            System.out.println("Nope, start all over.");
        }

        BankAccount checking = new CheckingAccount(accountNum, name, password);
        System.out.println("Your account number is: " + accountNum);
        System.out.println("You are: " + name);
        System.out.println("Your account number is: " + password);
        acct.add(checking);
    }

    public void viewAccounts(){
        for (BankAccount object : acct) {
            System.out.println(object);
        }
    }

    public void deleteFirstAccount(){
        acct.remove(0);
    }

}
