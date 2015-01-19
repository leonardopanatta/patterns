package net.panatta.patterns.antipattern.string;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StringBufferDemo {
	public static void main(String[] args) {
		System.out.println("Appending 1000 strings...");
		append(1000);
		System.out.println("Appending 10000 strings...");
		append(10000);
		System.out.println("Appending 100000 strings...");
		append(100000);
	}
	
	private static void append(int number) {
		long start = System.currentTimeMillis();
		
		StringBuffer sb = new StringBuffer(number * 16); // well estimated buffer
		for (int i = 0; i < number; i++) {
		    if (sb.length() > 0) sb.append(", ");
		    sb.append("string");
		}
		
		long finish = System.currentTimeMillis();
		
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.println("Execution time is " + formatter.format((finish - start) / 1000d) + " seconds");
	}
}
