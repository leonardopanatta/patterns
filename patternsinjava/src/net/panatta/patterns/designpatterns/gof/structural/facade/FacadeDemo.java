package net.panatta.patterns.designpatterns.gof.structural.facade;

public class FacadeDemo {
	public static void main(String[] args) {
		ComputerAssembleFacade computerAssembleFacade = new ComputerAssembleFacade();
		computerAssembleFacade.assembleComputer();
		System.out.println("Computer is assembled and ready to ship.");
	}
}
