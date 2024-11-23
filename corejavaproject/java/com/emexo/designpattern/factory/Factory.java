package com.emexo.designpattern.factory;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2
public class Factory {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter the country");
        String country = scanner.next();
        Currency rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getCurrency());
       }

}
