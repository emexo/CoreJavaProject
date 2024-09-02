package com.emexo.java12;

import java.util.ArrayList;
import java.util.List;

public class StringTransform {
    public static void main(String[] args) {
        List<String> names = List.of("     Alex   ","brian");
        List<String> transformedNames = new ArrayList<>();
  
        for (String name : names){
            String transformedName = name.transform(String::strip).transform(String::toUpperCase);
            transformedNames.add(transformedName);
        }
        System.out.println(transformedNames);
    }
}
