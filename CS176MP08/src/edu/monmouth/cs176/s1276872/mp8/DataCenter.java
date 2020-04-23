package edu.monmouth.cs176.s1276872.mp8;

import java.util.Arrays;

public class DataCenter {
	private final int MAX_DATA = 100;
	private Person[] personArray;
	private int goodData;
	
	public DataCenter() {
		personArray = new Person[MAX_DATA];
		goodData  = 0;
	}//Constructor for DataCenter
	
	public void addPerson(String inName, double inHeight) {
		Person addedPerson = new Person(inName, inHeight);
		if (goodData < MAX_DATA) {
			personArray[goodData] = addedPerson;
			goodData++;
		}//if goodData < MAX_DATA
		else
			System.out.println("I am sorry, but the array is full.");
	}//addPerson method
	
	public void sort() {
		Arrays.sort(personArray, 0, goodData);
	}//sort method
	
	public void printList() {
		String output;
		for (int i  = 0; i< goodData; i++) {
			output = personArray[i].toString();
			System.out.println(output);
		}//for
	}//printList method
	
	public double getAverage() {
		double average = Data.average(personArray, goodData);
		return average;
	}//getAverage method
	
	public Person getMax() {
		Person maxPerson = ((Person) Data.max(personArray, goodData));
		return maxPerson;
	}//getMax method

}//class DataCenter
