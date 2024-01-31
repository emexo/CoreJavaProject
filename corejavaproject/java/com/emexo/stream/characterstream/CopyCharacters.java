package com.emexo.stream.characterstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyCharacters {
    public static void main(String[] args) {

        try(FileReader fileReader = new FileReader("/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/inputfile.txt");
            FileWriter fileWriter = new FileWriter("/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/outputfile.txt")){

            int c;

            while( (c= fileReader.read()) != -1){
                fileWriter.write(c);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
