package com.emexo.variable.staticvariable;

public class Student {
    private static final String SCHOOL_NAME = "PES";

    private int studentId = 1;
    private String studentName ="Regu";

    public static void main(String[] args) {
        System.out.println(Student.SCHOOL_NAME);

        Student student = new Student();
        System.out.println(student.studentId);
        System.out.println(student.studentName);
    }
}
