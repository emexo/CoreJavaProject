package com.emexo.java11;

import java.util.ArrayList;
import java.util.List;


public class StringLines {
     public static void main(String[] args) 
    {
        String testString = "hello\nworld\nis\nexecuted";
 
        List<String> lines = new ArrayList<>();
 
        testString.lines().forEach(line -> lines.add(line));

        System.out.println(lines);
    }

}
