package net.panatta.patterns.antipattern.controlcoupling;

public class Semaphore {
	private static final int RED = 0;
	private static final int YELLOW = 1;
	private static final int GREEN = 2;
	
	private int color;
	
	public int getColor() {
		return color;
	}
	
	public void turnRed() {
		this.color = RED;
	}
	
	public void turnYellow() {
		this.color = YELLOW;
	}
	
	public void turnGreen() {
		this.color = GREEN;
	}
	
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore();
		semaphore.turnRed();
		
		// wait for 30 seconds
		semaphore.turnGreen();
		
		//wait for 30 seconds
		semaphore.turnYellow();

		//wait for 3 seconds
		semaphore.turnRed();
	}
}
