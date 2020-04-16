package edu.monmouth.cs176.s1276872.mp8;

public class Data {
	
	public static double average(Measurable[] inObjectsArray, int inGoodData) {
		double sum =0;
		for (int i = 0; i < inGoodData; i ++) {
			sum = sum + inObjectsArray[i].getMeasure();
		}//for
		if(inGoodData > 0) {
			return sum/inGoodData;
		}//if inGoodData >0
		else {
			return 0;
		}//else
	}//average method
	
	public static Measurable max(Measurable[] inObjectsArray, int inGoodData) {
		Measurable maxObject = inObjectsArray[0];
		for (int i = 0; i < inGoodData; i++) {
			if (inObjectsArray[i].getMeasure() > maxObject.getMeasure()) {
				maxObject = inObjectsArray[i];
			}
		}
		return maxObject;
	}//max method
}//class Data
