package com.coding.multithreading;

public class RunnableInterfacceExample extends Thread{
	
	
	public static void main(String[] srgs){
		RunnableInterfacceExample example = new RunnableInterfacceExample();
		
		Thread t = new Thread(example);
		t.setName("name");
		
		example.start();
	}
	
	@Override
	public void run() {
		insert();
	}

	public synchronized void insert() {


	}

}
