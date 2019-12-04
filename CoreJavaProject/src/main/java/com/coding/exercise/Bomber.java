package com.coding.exercise;

import java.util.Scanner;

public class Bomber {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input :");
		String input = sc.next();
		String output = removeDuplicate(input);
		System.out.println(output);

	}

	public static String removeDuplicate(String input) {
		String output = "";
		if (input.equals(null) || input =="") {
			output = "Invalid input";
		}

		char prevchar = input.charAt(0);

		for (int i = 0; i < input.length();) {

			char outputlastchar = ' ';
			if (output.length() > 0) {
				outputlastchar = output.charAt(output.length() - 1);
			}

			if (i == input.length() - 1) {
				if (outputlastchar != input.charAt(i)) {
					output += input.charAt(i);
				} else {
					if (output.length() > 0) {
						output = output.substring(0, output.length() - 1);
					}
				}
				break;
			}

			if ((input.charAt(i) == input.charAt(i + 1))) {
				int j = i;

				while (j < input.length() && input.charAt(j) == input.charAt(i)) {
					j++;
				}
				i = j;
				prevchar = input.charAt(j - 1);
			} else if (input.charAt(i) == outputlastchar) {

				if (output.length() > 0) {
					output = output.substring(0, output.length() - 1);
				}

				prevchar = input.charAt(i);
				i++;

			} else {
				output += input.charAt(i);
				prevchar = input.charAt(i);
				i++;

			}

		}

		return output;
	}

}