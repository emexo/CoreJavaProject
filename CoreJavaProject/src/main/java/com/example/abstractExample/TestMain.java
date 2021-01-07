package com.example.abstractExample;

public class TestMain {
	
	public static void main(String args[]) {
		WindowsServer server = new WindowsServer();
		server.start();
		server.stop();
		server.storage();
		System.out.println(server.name);
	}

}
