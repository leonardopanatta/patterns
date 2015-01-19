package net.panatta.patterns.antipattern.string;

public class OverkillInitialization {
	private int intA = 0;
	private long longA = 0L;
	private boolean booleanA = false;
	private String stringA = null;
	
	private int intB;
	private long longB;
	private boolean booleanB;
	private String stringB;
	
	{
		System.out.println("-> Instance initiazer called");
		System.out.println("-> Printing pre-initialized variable values...");
		System.out.println("int = " + intA);
		System.out.println("long = " + longA);
		System.out.println("boolean = " + booleanA);
		System.out.println("string = " + stringA);
		
		System.out.println("\n-> Printing NOT pre-initialized variable values...");
		System.out.println("int = " + intB);
		System.out.println("long = " + longB);
		System.out.println("boolean = " + booleanB);
		System.out.println("string = " + stringB);
	}
	
	public static void main(String[] args) {
		new OverkillInitialization();
	}
}
