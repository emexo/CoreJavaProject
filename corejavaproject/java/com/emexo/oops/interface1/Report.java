package com.emexo.oops.interface1;

public interface Report {
    String REPORT_TYPE_EOD = "EOD";
    String REPORT_TYPE_EOW = "EOW";
    String REPORT_TYPE_EOM = "EOM";

    String generateReport();

    public default void sort() {  // java 8
        System.out.println("Sort the report");
        privateMethod();
    }

    public static void stream() {
        System.out.println("Sort the report");
        //privateMethod();
    }

    private void privateMethod(){ //  java 11
        System.out.println("private Method");
    }

}
