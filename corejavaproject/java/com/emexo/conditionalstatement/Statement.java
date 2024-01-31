package com.emexo.conditionalstatement;

import java.util.Scanner;

public class Statement {

    public static void main(String[] args) {
       Statement statement = new Statement();
       String res = statement.generateReport("APAC");
        System.out.println(res);
    }

    public String generateReport(String region){
        String report = null;

        switch (region){
            case "APAC":
                report ="APAC Report";
                break;
            case "EMEA":
            case "NA":
                report ="NA Report";
                break;
            default:
                report ="Invalid region";
        }
        return report;
    }

    public String generateReport1(String region){
        String report = null;

        return switch (region){ // java 12
            case "APAC"->
                report ="APAC Report";
            case "NA","EMEA" ->
                report ="NA Report";
            default->
                report ="Invalid region";
        };

    }

    private static String getNumberViaYield(int number) {
        return switch (number) {  // java 13
            case 1, 2:
                yield "one or two";
            case 3:
                yield "three";
            case 4, 5, 6:
                yield "four or five or six";
            default:
                yield "unknown";
        };
    }

}


