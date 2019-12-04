package com.coding.nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample 
{
    public static void main(String[] args)
    {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\temp\\testFile1.txt")))
        {
  
            String currLine;
  
            while ((currLine = bufferedReader.readLine()) != null) 
            {
                System.out.println(currLine);
            }
  
        } 
        catch (IOException e) 
        {
            e.printStackTrace();	
        }
    }
}
