package com.emexo.variable.instancevariable;

public class Bank {
    public long accountNo = 10000l;
    public String accountName = "Sai";

    public static void main(String[] args) {
        Bank bank = new Bank();  // heap
        System.out.println(bank.accountName);
        System.out.println(bank.accountNo);
    }
}
