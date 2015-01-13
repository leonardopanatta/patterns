package net.panatta.patterns.designpattern.gof.creational.abstractfactory;

public class RedCarFactory implements CarFactory {

	@Override
	public Car assemble() {
		return new RedCarImpl();
	}
	
}
