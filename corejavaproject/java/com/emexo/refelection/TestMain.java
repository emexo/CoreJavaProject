package com.emexo.refelection;

import com.emexo.serialization.Employee;
import lombok.extern.slf4j.Slf4j;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
@Slf4j
public class TestMain {

    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();

        Class classObj = customer.getClass();

        // accessing the private variable
        Field field = classObj.getDeclaredField("customerId");
        field.setAccessible(true);
        field.set(customer, 67);
        log.info("Customer Id:{}", field.get(customer));

        // accessing the private method
        Method  method = classObj.getDeclaredMethod("getCustomerAddress");
        method.setAccessible(true);
        String customerAddress = (String) method.invoke(customer);
        log.info("Customer Address:{}", customerAddress );

        // accessing the public method with param
        Method  method1 = classObj.getDeclaredMethod("getCustomerAddress", String.class);
        // method1.setAccessible(true); // for the public method
        String customerAddress1 = (String) method1.invoke(customer, "Mumbai");
        log.info("Customer Address:{}", customerAddress1 );

        // get all the fields
        Field[] fields = classObj.getDeclaredFields();
        Arrays.stream(fields).forEach(field1 -> log.info("Filed Name:{}", field1));

        // get all the methods
        Method[] methods = classObj.getDeclaredMethods();
        Arrays.stream(methods).forEach(data -> log.info("Method Name:{}", data.getName()));

        // get the constructor
        Constructor[] constructors = classObj.getDeclaredConstructors();
        Arrays.stream(constructors).forEach(constructor -> log.info("Constructor Name:{}", constructor.getName()));

    }
}
