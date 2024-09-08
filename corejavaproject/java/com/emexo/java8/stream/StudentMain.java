package com.corejavaproject.java8.stream;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
@Log4j2
public class StudentMain {
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

        List<Student> goodStudents = new ArrayList<>();
        listStudents.forEach(student -> {
            if(student.getScore() >=70){
                goodStudents.add(student);
            }
        });


       List<Student> goodStudentList = listStudents.stream().filter(student -> student.getScore() >70).collect(Collectors.toList());

       listStudents.stream().mapToInt(stu -> stu.getScore()).average().getAsDouble();

      List<String> top3Students = listStudents.stream().sorted().limit(3).parallel().map(student -> student.getName()).collect(Collectors.toList());
        log.info(top3Students);
    }

    // order1 -- address1
    // order2 -- address1
    // order3 -- address2
    // order4 -- address3
}
