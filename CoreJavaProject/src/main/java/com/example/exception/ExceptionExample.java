package com.example.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionExample {

	public static void main(String[] args) {
		ExceptionExample obj = new ExceptionExample();

		//int response = obj.divide(10,2);
		//System.out.println(response);

		try {
			obj.calculator();
		}catch (CustomException ex) {
			ex.printStackTrace();
		}
	}

	public void calculator() throws CustomException {
		if(10==0){
			throw new CustomException();
		}
	}

	public void read (){
		try(FileInputStream stream = new FileInputStream("C://regu//input.txt")){

			while (stream.read()!= -1){

			}
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}

	public void read1() throws Exception{
		FileInputStream stream = null;
		try{
			stream = new FileInputStream("C://regu//input.txt");
			while (stream.read()!= -1){
				// read
			}
		} catch (Exception ex){
			ex.printStackTrace();
		} finally {
			stream.close();
		}
	}



}
