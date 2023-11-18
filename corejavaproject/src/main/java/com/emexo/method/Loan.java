package com.emexo.method;

import com.emexo.refelection.TestMain;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Loan {

    public static void loanType(){
        log.info("Loan Type:{}", "Home Loan");
    }

    public void  interest(int amount){
        log.info("Interest:{}", amount);
    }

    public static void main(String[] args) {
        Loan.loanType();
        Loan loan = new Loan();
        loan.interest(3000);

    }
}
