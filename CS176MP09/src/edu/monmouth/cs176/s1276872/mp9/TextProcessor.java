package edu.monmouth.cs176.s1276872.mp9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class TextProcessor {
	private ArrayList <String> inputStrings;
	
	public TextProcessor(File inInputFile) throws FileNotFoundException {
		inputStrings = new ArrayList<String>();
		Scanner sc = new Scanner(inInputFile);
		while (sc.hasNextLine()) {
			inputStrings.add(sc.nextLine());
		}//while
		sc.close();
	}//Constructor for TextProcessor
	
	public void printOut1(String inOutputName) throws FileNotFoundException {
		PrintWriter out1 = new PrintWriter(inOutputName);
		for (int i = 0; i< inputStrings.size(); i++) {
			out1.println("Line " + (i+1) + ": " + inputStrings.get(i));
		}//for
		out1.close();
		}//printOut1  method
	
	public void printOut2(String inOutputName) throws FileNotFoundException {
		PrintWriter out2 = new PrintWriter(inOutputName);
		Scanner sc;
		for (int i = 0; i< inputStrings.size(); i++) {
			sc = new Scanner(inputStrings.get(i));
			int wordCount = 1;
			while (sc.hasNext()) {
				String word = sc.next();
				out2.println("Line " + (i+1) + " Word " + wordCount + " " + word);
				wordCount++;
			}//while
			sc.close();
		}//for
		out2.close();
		}//printOut2  method
	
	public void print() {
		for (int i = 0; i < inputStrings.size(); i++)
			 System.out.println(inputStrings.get(i));
		}//toString
}//class 
