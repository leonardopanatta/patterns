package net.panatta.patterns.designpattern.gof.behavioral.chainofresponsibility;

public abstract class Logger {
	public static int ERR = 3;
    public static int NOTICE = 5;
    public static int DEBUG = 7;
    private int mask;
 
    // The next element in the chain of responsibility
    private Logger next;
 
    public Logger(int mask) {
        this.mask = mask;
    }
 
    public void setNext(Logger log) {
        next = log;
    }
 
    public void message(String msg, int priority) {
        if (priority <= mask) {
            writeMessage(msg);
        }
        if (next != null) {
            next.message(msg, priority);
        }
    }
 
    abstract protected void writeMessage(String msg);
}
