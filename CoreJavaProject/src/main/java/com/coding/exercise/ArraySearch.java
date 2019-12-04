package com.coding.exercise;

public class ArraySearch {
	
	public static void main(String[] args) {
		int[] array = {1,2,4,5,7};
		
		boolean status = false;
		
		int input = 15;
		
		for (int i=0; i<= array.length-1; i++) {
			
			if (array[i] == input) {
				status = true;
			}
			
		}
		
		if (status) {
			System.out.println("The given Input Found");
		} else {
			System.out.println("The given input not found");
		}
	}

}
