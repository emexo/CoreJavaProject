package com.emexo.reflection;

// class whose object is to be created
public class Test
{
    // creating a private field
    private String s;

    // creating a public constructor
    public Test()  {
        this.s = "eMexo";
    }

    public Test(String s) {
        this.s = s;
    }

    // Creating a public method with no arguments
    public void method1()  {
        System.out.println("The string is " + s);
    }

    // Creating a public method with int as argument
    public void method2(String n)  {
        System.out.println("The number is " + n);
    }

    // creating a private method
    private void method3() {
        System.out.println("Private method invoked");
    }
}


