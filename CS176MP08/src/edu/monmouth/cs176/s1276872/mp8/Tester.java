package edu.monmouth.cs176.s1276872.mp8;

public class Tester {

	public static void main(String[] args) {
	DataCenter dataCenter = new DataCenter();
	dataCenter.addPerson("Fed", 5.5);
	dataCenter.addPerson("Cad", 5);
	dataCenter.addPerson("Ash", 4);
	dataCenter.addPerson("Elf", 5.5);
	dataCenter.addPerson("Bae", 4.5);
	System.out.println("personArray before sort---");
	dataCenter.printList();
	dataCenter.sort();
	System.out.println();
	System.out.println("personArray after sort---");
	dataCenter.printList();
	System.out.println();
	System.out.println("personArray average height---" + dataCenter.getAverage());
	System.out.println();
	System.out.println("personArray max height Person---" + dataCenter.getMax());

	}//main

}//class Tester
