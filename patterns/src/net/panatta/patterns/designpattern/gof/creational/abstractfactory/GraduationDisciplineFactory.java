package net.panatta.patterns.designpattern.gof.creational.abstractfactory;

public class GraduationDisciplineFactory implements DisciplineFactory {

	@Override
	public CollegeClass createCollegeClass() {
		return new GraduationCollegeClassImpl();
	}
	
}
