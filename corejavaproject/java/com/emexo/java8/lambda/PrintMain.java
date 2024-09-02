package com.emexo.java8.lambda;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PrintMain {
    public static void main(String[] args) {
        Print obj = msg-> log.info("Message:{}", msg);


       obj.print("hi");

    }
}
