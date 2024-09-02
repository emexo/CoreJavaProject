package com.emexo.java8;

import lombok.extern.log4j.Log4j2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

@Log4j2
public class DateAndTime {
    public static void main(String[] args) {
        log.info(LocalDate.now());
        log.info(LocalDate.now().getDayOfMonth());
        log.info(LocalDate.of(2024, 02, 20));
        log.info(LocalDate.parse("2015-02-20"));
        log.info(LocalDate.now().plus(1, ChronoUnit.DAYS));
        log.info(LocalDate.now().minus(1, ChronoUnit.DAYS));


        log.info(LocalTime.now());
        log.info(LocalTime.now().getHour());
        log.info(LocalTime.now().plus(1, ChronoUnit.HOURS));


        log.info(LocalDateTime.now());
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd MMM yyyy");
        log.info(dTF.format(LocalDateTime.now()));

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        log.info(zoneId);

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        log.info(allZoneIds);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        log.info(zonedDateTime);
    }
}
