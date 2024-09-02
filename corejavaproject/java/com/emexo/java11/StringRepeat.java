package com.emexo.java11;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringRepeat {
    public static void main(String[] args) {
        String str = "HI".repeat(5);
        log.info(str);
    }
}
