package com.example.abstractExample;

public class TestMain {
	
	public static void main(String args[]) {
		Server server = new WindowsServer();
		server.start();
		server.stop();
		server.storage();
	}

}
