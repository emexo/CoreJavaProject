package com.emexo.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumber {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.UK, NumberFormat.Style.SHORT);
        String formattedString = formatter.format(25000L); //25K
        System.out.println(formattedString);

    }
}
