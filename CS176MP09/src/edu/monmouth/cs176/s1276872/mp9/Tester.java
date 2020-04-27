package edu.monmouth.cs176.s1276872.mp9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String input;
		System.out.println("Which file would you like to read from?");
		input = sc.next();
		File story = new File(input);
		TextProcessor textProcessor = new TextProcessor(story);
		//textProcessor.print(); This ensures that the file was entered into array correctly
		System.out.println("What name would you like for the first output file?");
		input = sc.next();
		textProcessor.printOut1(input);
		System.out.println("What name would you like for the second output file?");
		input = sc.next();
		textProcessor.printOut2(input);
		
	}//main

}//class
