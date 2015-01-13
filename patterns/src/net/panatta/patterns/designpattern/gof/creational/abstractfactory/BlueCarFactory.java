package net.panatta.patterns.designpattern.gof.creational.abstractfactory;

public class BlueCarFactory implements CarFactory {

	@Override
	public Car assemble() {
		return new BlueCarImpl();
	}
	
}
