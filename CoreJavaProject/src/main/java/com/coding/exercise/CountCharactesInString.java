package com.coding.exercise;

import java.util.HashMap;
import java.util.Map;

public class CountCharactesInString {
	
	public static void main(String[] args) {
		
		String input = "regu regu";
		
		Map<Character, Integer> output = countCharacter(input);
		
		output.forEach((k,v) -> {System.out.println(k + ":" + v);} );
		
	}
	
	
	public static Map<Character, Integer> countCharacter(String input) {
		Map<Character, Integer> map = new HashMap<Character, Integer> ();
		
		for (int i=0; i < input.length(); i++) {
			
		
			if (map.containsKey(input.charAt(i))){
				map.put(input.charAt(i), map.get(input.charAt(i)) +1);
			} else {
				map.put(input.charAt(i), 1);
			}
			}

		
		return map;
	}

}
