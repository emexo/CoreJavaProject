package com.emexo.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        ExceptionExample obj = new ExceptionExample();

        Scanner scanner = new Scanner(System.in);

        int response =obj.division(scanner.nextInt(), scanner.nextInt());
        System.out.println("Response: "+ response);

        try {
            obj.read("file");
        } catch (ApplicationNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int division(int input1, int input2){
        int output = 0;
        try {
            output = input1 / input2;
        } catch (ArithmeticException | NullPointerException ex){
            ex.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("output " + output);
        return output;
    }

    public void read(String file) throws ApplicationNotFoundException { // try with resource
        if(file == null){
            throw new ApplicationNotFoundException("Not a valid file");
        }

        try(FileInputStream inputStream = new FileInputStream(file);
            FileOutputStream outputStream = new FileOutputStream(file)) {

            int data = 0;

            while ((data = inputStream.read()) != -1){
                System.out.println(data);
            }

        } catch (IOException e) {
            throw new ApplicationNotFoundException( "Application not found", e);
        }
    }

    public void read1(String file) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try{
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(file);

            int data = 0;

            while ((data = inputStream.read()) != -1){
                outputStream.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
