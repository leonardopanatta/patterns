package net.panatta.patterns.antipatterns.controlcoupling;

public class SemaphoreWithControlCoupling {
	public static final int RED = 0;
	public static final int YELLOW = 1;
	public static final int GREEN = 2;
	
	private int color;

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		if (color == RED) {
			// wait for 30 seconds
			this.color = GREEN;
		} else if (color == YELLOW) {
			// wait for 3 seconds
			this.color = RED;
		} else if (color == GREEN) {
			// wait for 30 seconds
			this.color = YELLOW;
		}
	}
	
	public static void main(String[] args) {
		SemaphoreWithControlCoupling semaphoreWithControlCoupling = new SemaphoreWithControlCoupling();
		semaphoreWithControlCoupling.setColor(RED);
		
		// wait for 30 seconds
		semaphoreWithControlCoupling.setColor(GREEN);
				
		//wait for 30 seconds
		semaphoreWithControlCoupling.setColor(YELLOW);

		//wait for 3 seconds
		semaphoreWithControlCoupling.setColor(RED);
	}
}
