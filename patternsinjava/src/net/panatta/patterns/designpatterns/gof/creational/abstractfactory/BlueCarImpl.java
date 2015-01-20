package net.panatta.patterns.designpatterns.gof.creational.abstractfactory;

public class BlueCarImpl implements Car {

	private String color;
	private String chassi;
	
	public BlueCarImpl() {
		this.color = "BLUE";
		this.chassi = "XJ4UDI";
	}
	
	@Override
	public String getColor() {
		return color;
	}

	@Override
	public String getChassi() {
		return chassi;
	}

}
