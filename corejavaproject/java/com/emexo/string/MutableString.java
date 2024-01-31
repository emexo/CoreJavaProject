package com.emexo.string;


public class MutableString {
    public static void main(String[] args) {
        MutableString obj = new MutableString();
        StringBuffer response = obj.createMutableString("hi ", "hello ", "how are you");
        System.out.println(response);
        // convert mutable string to immutable string
        response.toString();
    }

    public StringBuffer createMutableString(String str1, String str2, String str3){
        StringBuffer buffer = new StringBuffer();
        buffer.append(str1);
        buffer.append(str2);
        buffer.append(str3);

        return buffer;
    }

    public StringBuilder createMutableString1(String str1, String str2, String str3){
        StringBuilder builder = new StringBuilder();
        builder.append(str1);
        builder.append(str2);
        builder.append(str3);

        return builder;
    }
}
