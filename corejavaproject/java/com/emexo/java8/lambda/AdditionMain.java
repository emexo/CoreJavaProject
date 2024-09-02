package com.emexo.java8.lambda;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AdditionMain {
    public static void main(String[] args) {
        Addition addition = (a, b) -> a+b;

        int response = addition.add(10, 20);
        log.info(response);
    }
}
