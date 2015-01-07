package net.panatta.patterns.designpattern.gof.creational.abstractfactory;

public class UndergraduationCollegeClassImpl implements CollegeClass {

	private int classNumber;
	
	public void setClassNumber(int number) {
		this.classNumber = number;
	}

	public int getClassNumber() {
		return classNumber;	
	}
}
