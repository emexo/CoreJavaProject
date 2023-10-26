package com.emexo.oops.interface1;

public class ReportMain {
    public static void main(String[] args) {
        Report report = new ApacReport();
        String apacReport = report.generateReport();
        System.out.println(apacReport);
        report.sort();
    }
}
