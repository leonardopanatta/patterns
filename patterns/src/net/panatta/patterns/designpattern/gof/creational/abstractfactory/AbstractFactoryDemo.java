package net.panatta.patterns.designpattern.gof.creational.abstractfactory;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		CarFactory redCarFactory = new RedCarFactory();
		CarFactory blueCarFactory = new BlueCarFactory();
		
		Car redCar = redCarFactory.assemble();
		Car blueCar = blueCarFactory.assemble();

		System.out.println(redCar.getColor() + " car assembled with chassi number " + redCar.getChassi());
		System.out.println(blueCar.getColor() + " car assembled with chassi number " + blueCar.getChassi());
	}
}
