package com.emexo.java8.streaming;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();

        listStudents.add(new Student("Alice", 82));
        listStudents.add(new Student("Bob", 90));
        listStudents.add(new Student("Carol", 67));
        listStudents.add(new Student("David", 80));
        listStudents.add(new Student("Eric", 55));
        listStudents.add(new Student("Frank", 49));
        listStudents.add(new Student("Gary", 88));
        listStudents.add(new Student("Henry", 98));
        listStudents.add(new Student("Ivan", 66));
        listStudents.add(new Student("John", 52));

        // without stream
        int sum = 0;
        if(CollectionUtils.isNotEmpty(listStudents)){
            for(Student student: listStudents){
                sum += student.getScore();
            }
        }

        double average = sum/listStudents.size();
        System.out.println(average);


        // with streaming

        List<Student> list = listStudents.stream().filter(student -> student.getScore() >=70).collect(Collectors.toList());
        System.out.println(list);

    }
}
