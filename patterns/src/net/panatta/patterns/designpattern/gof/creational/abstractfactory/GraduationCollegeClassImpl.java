package net.panatta.patterns.designpattern.gof.creational.abstractfactory;

public class GraduationCollegeClassImpl implements CollegeClass {

	private int classNumber;
	
	public void setClassNumber(int number) {
		this.classNumber = number + 10;
	}

	public int getClassNumber() {
		return classNumber;	
	}
}
