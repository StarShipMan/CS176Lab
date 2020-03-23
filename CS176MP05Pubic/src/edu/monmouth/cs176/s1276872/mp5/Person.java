package edu.monmouth.cs176.s1276872.mp5;

public class Person {
	private String name;
	private String gender;
	private double height;
	private int weight;
	private int age;
	
	public Person(String inName, String inGender, double inHeight, int inWeight, int inAge ) {
		name = inName;
		gender = inGender;
		height = inHeight;
		weight = inWeight;
		age = inAge;
	}//Person Constructor
	
	public String name() {
		return name;
	}//name method
	
	public String gender() {
		return gender;
	}//gender method
	
	public double height() {
		return height;
	}//height method
	
	public int weight() {
		return weight;
	}//weight method
	
	public int age() {
		return age;
	}//age method
	
	
	public void print() {
		System.out.println("Name: " + name + ", Gender: " + gender + ", Height: " + height + ", Weight: " + weight + ", Age: " + age + ".");
	}
	
}//class
