package com.emexo.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmployeeMain {
    public static void main(String[] args) {
        try {
            Test test = new Test();
            Class cls = test.getClass();

            // access private variable
            Field field = cls.getDeclaredField("s");
            field.setAccessible(true);
            field.set(test, "2");
            System.out.println(field.get(test));

            // access private method
            Method method = cls.getDeclaredMethod("method3");
            method.setAccessible(true);
            method.invoke(test);

            // access public method with parameter
            Method method1 = cls.getDeclaredMethod("method2", String.class);
            method1.invoke(test, "9");

            // examine the behaviour of the class
            // get the method names
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("### Get Method Names ###");
            for(Method m: methods){
                System.out.println(m.getName());
            }

            // get the constructor name
            Constructor[] constructors = cls.getConstructors();
            System.out.println("### Get Constructor Names ###");
            for(Constructor constructor: constructors ){
                System.out.println(constructor.getName());
            }

            Field[] fields = cls.getDeclaredFields();
            for(Field field1: fields){
                System.out.println(field1.getName());
            }


        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
