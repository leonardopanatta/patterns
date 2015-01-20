package net.panatta.patterns.designpatterns.gof.creational.abstractfactory;

public class BlueCarFactory implements CarFactory {

	@Override
	public Car assemble() {
		return new BlueCarImpl();
	}
	
}
