package com.emexo.string;

import com.emexo.scanner.ScannerExample;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringComparision {

    public static void main(String[] args) {
        StringComparision obj = new StringComparision();
        String str1 = "hello";
        String str2 = new String("Hello");

        boolean res = obj.usingEquals(str1, str2);
        log.info("Response:{}", res);
    }
    public boolean usingDoubleEquals(String str1, String str2){
        if(str1 == str2){
            return true;
        } else {
            return false;
        }
    }

    public boolean usingEquals(String str1, String str2){
        if(str1.equalsIgnoreCase(str2)){
            return true;
        }
        return false;
    }

    public boolean usingCompareTo(String str1, String str2){
        if(str1.compareTo(str2) == 0){
            return true;
        }

        return false;
    }
}
