package com.coding.nio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
	public static void main(String[] args) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\temp\\testOut.txt"))) {

			String content = "Hello Learner !! Welcome to howtodoinjava.com.";

			bufferedWriter.write(content);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
