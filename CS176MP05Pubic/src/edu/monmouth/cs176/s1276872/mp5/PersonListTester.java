package edu.monmouth.cs176.s1276872.mp5;

public class PersonListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Names of Five Persons
		String person1Name = "Adam";
		String person2Name = "Bob";
		String person3Name = "Cathy";
		String person4Name = "Diana";
		String person5Name = "Ethan";
		//Genders of Five Persons
		String person1Gender = "Male";
		String person2Gender = "Male";
		String person3Gender = "Female";
		String person4Gender = "Female";
		String person5Gender = "Male";
		//Height of Five Persons
		double person1Height = 4.0;
		double person2Height = 4.5;
		double person3Height = 5.0;
		double person4Height = 5.5;
		double person5Height = 6.0;
		//Weight of Five Persons
		int person1Weight = 110;
		int person2Weight = 120;
		int person3Weight = 130;
		int person4Weight = 140;
		int person5Weight = 150;
		//Age of Five Persons
		int person1Age = 20;
		int person2Age = 21;
		int person3Age = 22;
		int person4Age = 23;
		int person5Age = 24;
		//Constructing  PersonList1 and PersonList2
		PersonList1 personList1 = new PersonList1();
		PersonList2 personList2 = new PersonList2();
		//Adding Five Persons to PersonList1
		personList1.add(person1Name, person1Gender, person1Height, person1Weight, person1Age);
		personList1.add(person2Name, person2Gender, person2Height, person2Weight, person2Age);
		personList1.add(person3Name, person3Gender, person3Height, person3Weight, person3Age);
		personList1.add(person4Name, person4Gender, person4Height, person4Weight, person4Age);
		personList1.add(person5Name, person5Gender, person5Height, person5Weight, person5Age);
		//Adding Five Persons to PersonList2
		personList2.add(person1Name, person1Gender, person1Height, person1Weight, person1Age);
		personList2.add(person2Name, person2Gender, person2Height, person2Weight, person2Age);
		personList2.add(person3Name, person3Gender, person3Height, person3Weight, person3Age);
		personList2.add(person4Name, person4Gender, person4Height, person4Weight, person4Age);
		personList2.add(person5Name, person5Gender, person5Height, person5Weight, person5Age);
		
		//return Tallest of PersonList1 and PersonList2
		System.out.println("Tallest Person's Information in PersonList1");
		personList1.returnTallest().print();
		System.out.println("Tallest Person's Information in PersonList2");
		personList2.returnTallest().print();
	}//main

}//class
