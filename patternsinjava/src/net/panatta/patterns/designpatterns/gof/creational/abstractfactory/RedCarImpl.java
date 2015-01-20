package net.panatta.patterns.designpatterns.gof.creational.abstractfactory;

public class RedCarImpl implements Car {

	private String color;
	private String chassi;
	
	public RedCarImpl() {
		this.color = "RED";
		this.chassi = "JOASDW";
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
