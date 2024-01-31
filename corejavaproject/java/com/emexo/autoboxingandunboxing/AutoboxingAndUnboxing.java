package com.emexo.autoboxingandunboxing;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AutoboxingAndUnboxing {

    public static void main(String[] args) {
        AutoboxingAndUnboxing obj = new AutoboxingAndUnboxing();

        int input = 1;
        Integer response = obj.unBoxing(input);
        System.out.println(response);
    }

    public Integer autoBoxing(int input){
        Integer response = input;    // auto boxing
        return response;
    }

    public int unBoxing(Integer input){
        int response = input;    // unboxing
        return response;
    }
}
