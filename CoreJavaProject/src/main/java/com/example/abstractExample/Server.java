package com.example.abstractExample;

public abstract class Server {
	
	public String name = "Server";
	
	public Server() {
		System.out.println("Abstract Constructor");
	}
	
	public abstract void start();
	
	public abstract void stop();
	
	public void storage() {
		System.out.println("Storage");
	}
	
}
