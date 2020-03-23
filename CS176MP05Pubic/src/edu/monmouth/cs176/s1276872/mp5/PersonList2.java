package edu.monmouth.cs176.s1276872.mp5;

import java.util.ArrayList;

public class PersonList2 {
	ArrayList<Person> PersonList;
	public PersonList2() {
		PersonList = new ArrayList<Person>();
	}//PersonList1 Constructor
	
	public void add(String inName, String inGender, double inHeight, int inWeight, int inAge ) {
		Person newPerson = new Person(inName, inGender, inHeight, inWeight, inAge );
		PersonList.add(newPerson) ;
	}//add method
	public Person returnTallest() {
		Person tallestPerson = PersonList.get(0);
		for (int i = 0; i < PersonList.size(); i++){
				if (PersonList.get(i).height() > tallestPerson.height())
					tallestPerson = PersonList.get(i);
		}//for
		return tallestPerson;
	}//returnTallest method
	
	public void print() {
		for (int i = 0; i < PersonList.size(); i++)
			 PersonList.get(i).print();
		}//toString

}//class