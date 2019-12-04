package com.coding.exercise;

public class ReverseStringInPlace {
	
	public static void main(String[] args) {
		
		String input = "$regu welcome@";
		
		String output = reverseString(input);
		
		System.out.println(output);
		
	}
	
	public static String reverseString(String input) {
		
		StringBuilder builder = new StringBuilder(input);
		
		int length = input.length();
		
		for (int i=0; i<length/2; i++) {
			
			char first = input.charAt(i);
			
			char tmp = first;
			
			builder.setCharAt(i, input.charAt(length-i-1));
			builder.setCharAt(length-i-1, tmp);
		}
		
		return builder.toString();
	}

}
