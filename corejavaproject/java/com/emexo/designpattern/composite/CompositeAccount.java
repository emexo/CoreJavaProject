package com.emexo.designpattern.composite;

public class CompositeAccount extends Component {
    private float totalBalance;
    private AccountStatement compositeStmt;
    private AccountStatement individualStmt;

    public float getBalance() {
        totalBalance = 0;
        for (Component f : list) {
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }

    public AccountStatement getStatement() {
        for (Component f : list) {
            individualStmt = f.getStatement();
            //compositeStmt.merge(individualStmt);
        }
        return compositeStmt;
    }

}
