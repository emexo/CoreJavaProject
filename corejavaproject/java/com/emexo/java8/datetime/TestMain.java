package com.emexo.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TestMain {
    public static void main(String[] args) {
        /*System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2020, 05, 31));
        System.out.println(LocalDate.parse("2020-05-31"));
        System.out.println(LocalDate.now().minusDays(2));
        System.out.println(LocalDate.now().minus(2, ChronoUnit.YEARS));*/

        System.out.println(LocalDateTime.now());

    }
}
