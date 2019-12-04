package com.coding.exercise;

public class Power {

	public static void main(String[] args) {

		int num = 25;
		System.out.print(getPower((num)));
	}

	public static int getPower(int num) {
		double p;
		for (int base = 2; base < 65536; base++) {
			p = Math.log(num) / Math.log(base);
			if (p == (int) p)
				return (int) p;

		}
		return 1;
	}
}