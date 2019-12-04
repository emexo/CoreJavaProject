package com.coding.exercise;

public class RemoveDuplicateCharacterInString {
	
	public static void main(String[] args) {
		
		String input = "aaabbbaaa";
		
		String output = removeDuplicate(input);
		
		System.out.println(output);
	}
	
	public static String removeDuplicate(String input) {
		StringBuilder builder = new StringBuilder();
		
		for (int i =0; i<input.length(); i++) {
			String ch = String.valueOf(input.charAt(i));
			
			if (builder.indexOf(ch) ==-1) {
				builder.append(ch);
			}
		}
		
		return builder.toString();
	}
	

}
