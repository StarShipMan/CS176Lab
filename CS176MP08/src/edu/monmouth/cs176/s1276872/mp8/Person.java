package edu.monmouth.cs176.s1276872.mp8;

public class Person implements Comparable<Person>, Measurable{
	private String name;
	private double height;
	
	public Person(String inName, double inHeight) {
		name = inName;
		height = inHeight;
	}//Constructor for Person
	
	public String toString() {
		String personNameAndHeight = "Name: " + name + ", Height: " + height;
		return personNameAndHeight;
	}//toString method
	
	public int compareTo(Person otherPerson) {
		if (height < otherPerson.height) {
			return-1;
		}//if this < other
		else if (height > otherPerson.height) {
			return 1;
		}
		else
			return 0;
	}//implemented compareTo method from Comparable

	public double getMeasure() {
		return height;
	}//implemented getMeasure method from Measurable
	
}//class Person
