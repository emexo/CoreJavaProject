package com.emexo.designpattern.factory;

public class CurrencyFactory {
    public static Currency createCurrency(String country) {
        return switch (country.toLowerCase()) {
            case "india" -> new Rupee();
            case "singapore" -> new SGDDollar();
            case "us" -> new USDollar();
            default -> throw new IllegalArgumentException("No such currency");
        };
    }

}
