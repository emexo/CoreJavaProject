package com.emexo.oops.interface1;

public interface Report1 {
    String REPORT_TYPE_EOD = "EOD";
    String REPORT_TYPE_EOW = "EOW";
    String REPORT_TYPE_EOM = "EOM";

    String generateReport();

    public default void sort() {
        System.out.println("Sort the report");
    }
}
