package com.emexo.oops.interface1;

public class ApacReport implements Report, Report1{
    @Override
    public String generateReport() {
        return "APAC Report";
    }

    @Override
    public void sort() {
        Report1.super.sort();
    }


    @Override
    public String toString() {
        return "ApacReport{}";
    }
}
