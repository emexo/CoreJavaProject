package com.example.abstractExample;

public interface ServerNew {
	

	public void start();
	
	public abstract void stop();

	default void print() {

		System.out.println("print");
}

}
