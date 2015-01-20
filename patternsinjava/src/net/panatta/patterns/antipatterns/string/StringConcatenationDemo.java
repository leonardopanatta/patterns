package net.panatta.patterns.antipatterns.string;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StringConcatenationDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Concatenating 1000 strings...");
		concatenate(1000);
		System.out.println("Concatenating 10000 strings...");
		concatenate(10000);
		System.out.println("Concatenating 100000 strings...");
		concatenate(100000);
	}
	
	private static void concatenate(int number) {
		long start = System.currentTimeMillis();
		
		String s = "";
		for (int i = 0; i < number; i++) {
			s += ", " + "string";
		}
		    
		s = s.substring(2); //remove first comma
		
		long finish = System.currentTimeMillis();
		
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.println("Execution time is " + formatter.format((finish - start) / 1000d) + " seconds");
	}
}
