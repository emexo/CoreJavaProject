package com.emexo.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionExample {

	public static void main(String[] args) {
		ExceptionExample obj = new ExceptionExample();
		int response = obj.divide(10,0);
		System.out.println("Response :" + response);
		System.out.println(obj.getData());
	}

	public void getAge(int age) throws Exception {
		if (age < 18) {
				throw new Exception("Invalid Age");
			}
		System.out.println("Valid Age");
	}




	public void read (){
		try(FileInputStream stream = new FileInputStream("C://regu//input.txt"); ){ // try with resource java 7
			int a;
			while ( (a=stream.read())!= -1){
				System.out.println(a);
			}
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}

	public void read1() throws IOException {
		FileInputStream stream = null;
		try{
			stream = new FileInputStream("C://regu//input.txt");
			int a;
			while ( (a=stream.read())!= -1){
				System.out.println(a);
			}
		} catch (IOException | ArithmeticException ex1){
			ex1.printStackTrace();
		} finally {
			stream.close();
		}
	}

	public int divide(int input1, int input2) {
		int output = 0;
		try {
			String str = null;
			str.toUpperCase();
			output = input1 / input2;
		}catch (ArithmeticException | NullPointerException ex){ // from java 7
			ex.printStackTrace();
		}finally {
			System.out.println("Finally Block");
		}
		System.out.println("output : " + output);
		return output;
	}





	public int getData() {
		try {
			System.out.println("Enter Input1 :");
			return 10;

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			return 20;
		}
	}

}
