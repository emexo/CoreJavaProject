package com.emexo.oops.interface1;

public class ApacReport implements Report, Report1{
    @Override
    public String generateReport() {
        return null;
    }

    @Override
    public void sort() {
        Report1.super.sort();
    }

}
