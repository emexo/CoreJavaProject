package com.emexo.stream.bufferedstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyLines {
    public static void main(String[] args) {
        try(BufferedReader fileReader = new BufferedReader(new FileReader("/Users/regus/Documents/F/CoreJavaRepo/corejavaproject/src/main/resources/bufferedreader.txt"));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("/Users/regus/Documents/F/CoreJavaRepo/corejavaproject/src/main/resources/bufferedwriter.txt"))){

            String line;

            while( (line= fileReader.readLine()) != null){
                fileWriter.write(line);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
