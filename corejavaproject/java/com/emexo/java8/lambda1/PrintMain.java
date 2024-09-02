package com.emexo.java8.lambda1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PrintMain {
    public static void main(String[] args) {
        Print print = str -> log.info(str);

        print.print("Lambda Expression");
    }
}
