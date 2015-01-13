package net.panatta.patterns.designpattern.gof.structural.facade;

public class ComputerAssembleFacade {
	private Keyboard keyboard;
	private Mouse mouse;
	private Monitor monitor;
	private Case computerCase;
	
	public ComputerAssembleFacade() {
		this.keyboard = new Keyboard();
		this.mouse = new Mouse();
		this.monitor = new Monitor();
		this.computerCase = new Case();
	}
	
	public void assembleComputer() {
		System.out.println(keyboard.assembleKeys());
		System.out.println(mouse.assembleLaser());
		System.out.println(mouse.assembleLeftButton());
		System.out.println(mouse.assembleRightButton());
		System.out.println(monitor.assembleScreen());
		System.out.println(computerCase.assembleMotherBoard());
		System.out.println(computerCase.assembleGraphicsCard());
	}
}
