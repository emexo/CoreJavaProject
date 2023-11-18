package com.emexo.conditionalstatement;

import java.time.LocalDate;
import java.util.Date;

public class ConditionalStatementExample {

    public static void main(String[] args) {
        ConditionalStatementExample obj = new ConditionalStatementExample();
        String report = obj.generateReport("APAC");
        System.out.println(report);

    }

    public String generateReport(String region){
        String report = null;
        switch (region){
            case "APAC":
                report = "APAC Report";
                break;
            case "EMEA":
            case "NA":
                report ="NA Report";
                break;
            default:
                report = "Invalid Region";
        }

        return report;
    }
}


