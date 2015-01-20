package net.panatta.patterns.designpatterns.gof.creational.abstractfactory;

public class RedCarFactory implements CarFactory {

	@Override
	public Car assemble() {
		return new RedCarImpl();
	}
	
}
