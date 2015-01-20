package net.panatta.patterns.designpatterns.gof.behavioral.chainofresponsibility;

public class StdoutLogger extends Logger {
	public StdoutLogger(int mask) {
		super(mask);
	}
	
	protected void writeMessage(String msg) {
        System.out.println("Writing to stdout: " + msg);
    }
}
