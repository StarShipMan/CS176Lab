package edu.monmouth.cs176.s1276872.mp5;


public class PersonList1 {
	Person[] PersonList;
	final int ARRAY_SIZE = 100;
	int addedCounter = 0;
	public PersonList1() {
		PersonList = new Person[ARRAY_SIZE];
	}//PersonList1 Constructor
	
	public void add(String inName, String inGender, double inHeight, int inWeight, int inAge ) {
		Person newPerson = new Person(inName, inGender, inHeight, inWeight, inAge );
		PersonList[addedCounter] = newPerson ;
		addedCounter++;
	}//add method
	
	public Person returnTallest() {
		Person tallestPerson = PersonList[0];
		for (int i = 0; i < addedCounter; i++){
				if (PersonList[i].height() > tallestPerson.height())
					tallestPerson = PersonList[i];
		}//for
		return tallestPerson;
	}//returnTallest method
	
	public void print() {
		for (int i = 0; i < addedCounter; i++)
			 PersonList[i].print();
		}//toString

}//class

