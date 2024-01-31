package com.emexo.scanner;

import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //scanner.useDelimiter(",");
        System.out.println("Enter the input:");
        log.info("Input1: "+ scanner.nextInt());
        //log.info("Input2: "+ scanner.next());
        //log.info("Input3: "+ scanner.next());
    }

}
