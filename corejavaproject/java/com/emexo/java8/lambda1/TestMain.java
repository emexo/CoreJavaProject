package com.emexo.java8.lambda1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {
    public static void main(String[] args) {
        Addition addition = (input1, input2) -> {
            int response = input1 + input2;
            return response;
        };

        int output = addition.add(10, 12);
        log.info("Output:{}", output);
    }
}
