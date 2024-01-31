package com.emexo.variable.instancevariable;

public class Account {
    // instance variable
    public long accountNo;
    public String accountName;

    public static void main(String[] args) {
        // create a object
        Account account = new Account();
        account.accountNo = 1000l;
        account.accountName = "Regu";

        System.out.println(account.accountNo + " : "+ account.accountName);
    }
}
