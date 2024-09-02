package com.emexo.java11;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringTrim {
    public static void main(String[] args) {
        String s = "test string\u205F";
        System.out.println(s);
        String striped = s.strip();
        System.out.printf("'%s'%n", striped);//'test string'

        String trimmed = s.trim();
        System.out.printf("'%s'%n", trimmed);//'test string '

    }
}
