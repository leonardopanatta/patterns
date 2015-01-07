package net.panatta.patterns.designpattern.gof.creational.abstractfactory;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		DisciplineFactory undergraduationDisciplineFactory = new UndergraduationDisciplineFactory();
		CollegeClass undergraduationCollegeClass = undergraduationDisciplineFactory.createCollegeClass();
		undergraduationCollegeClass.setClassNumber(100);
		
		DisciplineFactory graduationDisciplineFactory = new GraduationDisciplineFactory();
		CollegeClass graduationCollegeClass = graduationDisciplineFactory.createCollegeClass();
		graduationCollegeClass.setClassNumber(100);
		
		System.out.println(undergraduationCollegeClass.getClassNumber());
		System.out.println(graduationCollegeClass.getClassNumber());
	}
}
