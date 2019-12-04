package com.coding.multithreading.lock;

import java.util.concurrent.locks.*;

/**
 * This class represents a bank that manages accounts and provides
 * money transfer function.
 * It demonstrates how to use the locking mechanism with a condition object.
 */
public class BankCondition {
    public static final int MAX_ACCOUNT = 10;
    public static final int MAX_AMOUNT = 10;
    public static final int INITIAL_BALANCE = 100;

    private Account[] accounts = new Account[MAX_ACCOUNT];

    private Lock bankLock;
    private Condition availableFund;

    public BankCondition() {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(INITIAL_BALANCE);
        }

        bankLock = new ReentrantLock();
        availableFund = bankLock.newCondition();
    }

    public void transfer(int from, int to, int amount) {
        bankLock.lock();

        try {
            while (accounts[from].getBalance() < amount) {
                availableFund.await();
            }

            accounts[from].withdraw(amount);
            accounts[to].deposit(amount);

            String message = "%s transfered %d from %s to %s. Total balance: %d\n";
            String threadName = Thread.currentThread().getName();
            System.out.printf(message, threadName, amount, from, to, getTotalBalance());

            availableFund.signalAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bankLock.unlock();
        }
    }

    public int getTotalBalance() {

        bankLock.lock();

        try {
            int total = 0;

            for (int i = 0; i < accounts.length; i++) {
                total += accounts[i].getBalance();
            }

            return total;
        } finally {
            bankLock.unlock();
        }
    }
}
