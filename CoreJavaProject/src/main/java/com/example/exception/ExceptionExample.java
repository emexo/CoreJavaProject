package com.example.exception;

import java.io.FileInputStream;

public class ExceptionExample {

	public static void main(String[] args) {
		ExceptionExample obj = new ExceptionExample();

		int response = obj.divide(10,0);
		System.out.println(response);

		try {
			obj.calculator();
		}catch (CustomException ex) {
			ex.printStackTrace();
		}
	}

	public void calculator() throws CustomException {
		if(10==0){
			throw new CustomException("COB Date not Found");
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
		//FileInputStream stream = null;
		try(FileInputStream stream = new FileInputStream("C://regu//input.txt");){

			while (stream.read()!= -1){
				// read
			}
			System.exit(20);
		} catch (Exception ex){
			ex.printStackTrace();
		} /*finally {
			stream.close();
		}*/
	}

	public int divide(int input1, int input2){
		int response =0;
		try {
			response = input1 / input2;
		} finally {

		}

		System.out.println("Response :" + response);

		return response;
	}



}
