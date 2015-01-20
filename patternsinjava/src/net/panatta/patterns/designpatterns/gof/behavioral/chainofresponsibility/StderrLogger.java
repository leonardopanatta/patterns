package net.panatta.patterns.designpatterns.gof.behavioral.chainofresponsibility;

public class StderrLogger extends Logger {

	public StderrLogger(int mask) {
		super(mask);
	}
	
	protected void writeMessage(String msg) {
        System.err.println("Sending to stderr: " + msg);
    }

}
