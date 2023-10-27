package com.emexo.scanner;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScannerExample {

    private static final Logger LOGGER = LogManager.getLogger(ScannerExample.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("/");
        System.out.println("Enter the input:");
        LOGGER.info("Input1: "+ scanner.nextInt());
        LOGGER.info("Input2: "+ scanner.nextInt());
        LOGGER.info("Input3: "+ scanner.nextInt());
    }

}
