package com.emexo.stream.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyBytes {
    public static void main(String[] args) {

        try(FileInputStream inputStream = new FileInputStream("/Users/regus/Documents/F/CoreJavaRepo/corejavaproject/src/main/resources/fileinputstream.txt");
            FileOutputStream outputStream = new FileOutputStream("/Users/regus/Documents/F/CoreJavaRepo/corejavaproject/src/main/resources/fileoutputstream.txt")){

            int c;

            while( (c= inputStream.read()) != -1){
                outputStream.write(c);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
