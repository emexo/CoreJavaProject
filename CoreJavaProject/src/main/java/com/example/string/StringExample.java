package com.example.string;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome"; // immutable class 
		str.toUpperCase();
		
		//System.out.println(str);
		
		StringBuilder builder = new StringBuilder("hello ");
		builder.append("world");
		
		System.out.println(builder);
		
		/*List<String> list = new ArrayList<>();
		list.add("regu");
		
		System.out.println(list.toString());*/
		
	}
	
	@Override
	public void finalize() {
		System.out.println("clean up");
	}



}
