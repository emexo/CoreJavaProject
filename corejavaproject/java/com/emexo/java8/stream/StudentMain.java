package com.emexo.java8.stream;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
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

       List<Student> students = listStudents.parallelStream()
               .filter(student -> student.getScore()>=70).collect(Collectors.toList());
       //log.info(students);

       double average = listStudents.stream().mapToInt(student -> student.getScore()).average().getAsDouble();
      // log.info("Average:{}", average);

      List<Student> students1 = listStudents.parallelStream().sorted().limit(3).collect(Collectors.toList());
      log.info(students1);
    }
}
