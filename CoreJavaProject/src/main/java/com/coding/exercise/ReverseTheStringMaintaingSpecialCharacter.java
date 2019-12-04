package com.coding.exercise;

public class ReverseTheStringMaintaingSpecialCharacter {
		public static void main(String[] args) {
			String input = "#Regu@gmail.com#";
			System.out.println("Input String  :   " + input);
			
			String output = reverse(input);
			System.out.println("Reversed String : " + output);
		}
		
		public static String reverse(String input) {		
			char[] inputArray = input.toCharArray();		
			// length of the array
			int length = inputArray.length;
			
			int left = 0;
			int right = length -1;
			
			while (left < right) {
				// check if the first character is special character
				if (String.valueOf(inputArray[left]).matches("[^a-z A-Z 0-9]")) {
					left++;
				// check if the last character is special character
				} else if (String.valueOf(inputArray[right]).matches("[^a-z A-Z 0-9]")) {
					right--;
				} else {
					char temp = inputArray[left];
					inputArray[left] = inputArray[right];
					inputArray[right] = temp;
					left++;
					right--;
				}
			}
			return String.valueOf(inputArray);
		}
	}  


