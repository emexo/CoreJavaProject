package com.corejavaproject.java8.stream;

import lombok.*;

@Getter
@Setter
@ToString
public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }


    public int compareTo(Student student) {
        return student.getScore() - this.score;
    }
}