package net.panatta.patterns.antipatterns.string;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int n = 1000000;
        long start, finish;
        
        System.out.print("Performing " + n + " appends via StringBuffer...");
        StringBuffer sBuffer = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
        	sBuffer.append("string");
        }
        finish = System.currentTimeMillis();
        
        NumberFormat numberFormat = new DecimalFormat("#0.00000");
		System.out.println(numberFormat.format((finish - start) / 1000d) + " seconds");

		System.out.print("Performing " + n + " appends via StringBuilder...");
        StringBuilder sBuilder = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
        	sBuilder.append("string");
        }
        finish = System.currentTimeMillis();
        
		System.out.println(numberFormat.format((finish - start) / 1000d) + " seconds");
    }
}
