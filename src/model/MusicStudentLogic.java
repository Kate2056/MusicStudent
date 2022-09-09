/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package model;


public class MusicStudentLogic {
	public double calculateMonthlyIncomeFromStudent(MusicStudent student) {
		double monthlyIncome = student.getLessonCost() * 4;
		return monthlyIncome;
	}
	public String findStudentMethod(MusicStudent student) {
		String method;
		if(student.getAge() < 18) {
			method = "Youth";
		}else if(student.getAge() < 65) {
			method ="Adult" ;
		}else method = "Senior";
		return method;
	}
	public String studentInformation(MusicStudent student) {
		String studentMethod = findStudentMethod(student);
		double studentMonthlyIncome = calculateMonthlyIncomeFromStudent(student);
		return "Name: " + student.getName() + " Age: " + student.getAge() + " Method: " 
				+ studentMethod + " Weekly Lesson Cost: " + student.getLessonCost() +
				" Monthly Income From Student: " + studentMonthlyIncome;
	}
}
