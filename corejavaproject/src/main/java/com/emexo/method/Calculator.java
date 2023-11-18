package com.emexo.method;

import com.emexo.refelection.TestMain;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Calculator {

    public int addition(int input1, int input2){
        return  input1+ input2;
    }

    public static void main(String[] args) {
        Calculator calculator  = new Calculator();
        int res = calculator.addition(10,4);
        log.info("Output:{}", res);

        int res2 = calculator.addition(30,3);
        log.info("Output:{}", res2);
    }
}
