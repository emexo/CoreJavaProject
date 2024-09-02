package com.emexo.java8.stream;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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


    public int compareTo(Student another) {
        return another.getScore() - this.score;
    }
}