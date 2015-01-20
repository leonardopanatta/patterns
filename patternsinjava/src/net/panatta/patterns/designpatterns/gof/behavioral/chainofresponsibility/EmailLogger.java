package net.panatta.patterns.designpatterns.gof.behavioral.chainofresponsibility;

public class EmailLogger extends Logger {
	public EmailLogger(int mask) {
        super(mask);
    }
 
    protected void writeMessage(String msg) {
        System.out.println("Sending via e-mail: " + msg);
    }
}
