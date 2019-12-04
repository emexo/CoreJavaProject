package com.coding.synchrinized;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedBlockExample {

	public static void main(String[] args) {

	}

	public void synchronizedBlockExample() {

		synchronized (this) {
			List<String> list = new ArrayList<>();
			list.add("name1");
			list.add("name2");

		}
	}

	public void sychronizedBlockExample() {

		synchronized (SynchronizedBlockExample.class) {
			List<String> list1 = new ArrayList<String>();
			list1.add("one");
			list1.add("two");
		}
	}
	
	@Override
	public void finalize() {
		
	}

}
