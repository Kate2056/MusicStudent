/**
 * @author Kaitlyn Briggs - krbriggs
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package model;

public class MusicStudent {
	private String name;
	private String instrument;
	private double lessonCost;
	private int age;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public double getLessonCost() {
		return lessonCost;
	}
	public void setLessonCost(double lessonCost) {
		this.lessonCost = lessonCost;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//Constructors
	public MusicStudent() {
		this.name = "";
		this.instrument = "";
		this.lessonCost = 0;
		this.age = 0;
	}
	
	public MusicStudent(String name, String instrument, double lessonCost, int age) {
		this.name = name;
		this.instrument = instrument;
		this.lessonCost = lessonCost;
		this.age = age;
	}
	
	
}
