package com.emexo.oops.interface1;

public class ReportMain {
    public static void main(String[] args) {
        Report report = new ApacReport();
        String apacReport = report.generateReport();
        report.sort();
        Report.stream();
        System.out.println(apacReport);
        System.out.println(Report.REPORT_TYPE_EOD);
    }
}
