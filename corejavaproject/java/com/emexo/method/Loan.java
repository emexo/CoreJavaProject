package com.emexo.method;

import com.emexo.refelection.TestMain;
import lombok.extern.slf4j.Slf4j;



public class Loan {

    public static void loanType(){
        System.out.println("Loan Type: Home Loan");
    }

    public int  interest(int amount){
       int response = amount+ 100;
       return response;
    }

    public static void main(String[] args) {
        Loan.loanType();
        Loan loan = new Loan();
         int output = loan.interest(3000);
        System.out.println(output);

    }
}
