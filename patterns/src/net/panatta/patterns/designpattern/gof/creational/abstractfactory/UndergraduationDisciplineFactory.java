package net.panatta.patterns.designpattern.gof.creational.abstractfactory;

public class UndergraduationDisciplineFactory implements DisciplineFactory {

	@Override
	public CollegeClass createCollegeClass() {
		return new UndergraduationCollegeClassImpl();
	}
	
}
