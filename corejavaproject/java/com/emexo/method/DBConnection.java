package com.emexo.method;

public class DBConnection {
    // variable
    // constructor
    // method
    public static void getConnection(){
        System.out.println("DB Connection");
    }

    public static String getConnection1(){
        String str = "DB Connection";
        return str;
    }

    public static void main(String[] args) {
        DBConnection.getConnection();
        String str = DBConnection.getConnection1();
        System.out.println(str);
    }
}
