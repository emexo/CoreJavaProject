package com.coding.exercise;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		ScannerExample example = new ScannerExample();
		//example.print("");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Output Data - " + scan.nextLine());
		
	}
	
	public void print(Object obj) {
		System.out.println("print object");
	}
	
	public void print(String str) {
		System.out.println("print String");
	}
}
