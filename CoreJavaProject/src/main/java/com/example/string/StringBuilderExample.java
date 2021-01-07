package com.example.string;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuffer builder = new StringBuffer("hi "); // mutable
        builder.append("hi ");
        builder.append("hello ");
        builder.append("how are you");

        System.out.println(builder.toString());
    }
}
