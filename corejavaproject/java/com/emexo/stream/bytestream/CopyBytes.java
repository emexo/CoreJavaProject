package com.emexo.stream.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyBytes {
    public static void main(String[] args) {

        try(FileInputStream inputStream = new FileInputStream("/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/inputfile.txt");
            FileOutputStream outputStream = new FileOutputStream("/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/outfile.txt")){

            int c;

            while( (c= inputStream.read()) != -1){
                outputStream.write(c);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
