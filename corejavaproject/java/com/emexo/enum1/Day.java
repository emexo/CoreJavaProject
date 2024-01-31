package com.emexo.enum1;

public enum Day {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(7);

    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    private int dayNumber;

    public int getDayNumber() {
        return this.dayNumber;
    }
}
