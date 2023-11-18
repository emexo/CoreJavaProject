package com.emexo.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MutableString {
    public static void main(String[] args) {
        MutableString mutableString = new MutableString();
        String str = mutableString.stringBuffer("Hi", " hello", " How are you");
        log.info(str);
    }

    public String stringBuffer(String input1, String input2, String input3){
        StringBuffer buffer = new StringBuffer();
        buffer.append(input1);
        buffer.append(input2);
        buffer.append(input3);
        return buffer.toString(); // mutable to immutable string
    }

    public StringBuilder stringBuilder(String input1, String input2, String input3){
        StringBuilder builder = new StringBuilder();
        builder.append(input1);
        builder.append(input2);
        builder.append(input3);
        return builder;
    }
}
