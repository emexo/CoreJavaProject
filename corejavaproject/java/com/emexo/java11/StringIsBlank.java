package com.emexo.java11;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringIsBlank {
    public static void main(String[] args) {
        String str = "  ";
        log.info(str.length());
        log.info(str.isEmpty());
        log.info(str.isBlank());
    }
}
