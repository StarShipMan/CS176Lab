import java.util.Scanner;
import java.util.Random;

class Characteristics {

	public String[] characteristics;

	public Characteristics(String[] chara) {
		characteristics = new String[5];
		characteristics = chara;
	}// Characteristics Constructor

}// class Characteristics

class FamilyExpressions extends Characteristics {

	public String[][] expression;
	public String[] combination;

	public FamilyExpressions(String[] chara, String[][] expr, String[] comb) {
		super(chara);
		expression = new String[5][4];
		expression = expr;
		combination = new String[4];
		combination = comb;
	}// FamilyExpressions Constructor

}// class FamilyExpressions

class Mother extends FamilyExpressions {
	public String mFirstName;
	public String[] motherGenes;

	public Mother(String[] chara, String[][] expr, String[] comb) {
		super(chara, expr, comb);
		motherGenes = new String[5];
	}// Mother Constructor
	public void setName(String inFirstName) {
		mFirstName = inFirstName;
	}

}// class Mother

class Father {
	public String fFirstName;
	public String[] fatherGenes;

	public Father() {
		fatherGenes = new String[5];
	}// Father Constructor
	
	public void setName(String inFirstName) {
		fFirstName = inFirstName;
	}

}// class Father


// main class child


public class Child {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userInput;
		String[] childGenes = new String[5];
		String[][] expr = { { "brown", "blue", "green", "grey" }, { "brown", "black", "blonde", "red" },
				{ "Male", "Female", "Female", "Male" }, { "6.5", "6.0", "5.5", "5.0" },
				{ "normal", "near", "far", "color-blind" } };
		String[] combo = { "DD", "RR", "DR", "RD" };
		String[] chara = { "Eye Color", "Hair Color", "Sex", "Height", "Vision" };
		Mother mother = new Mother(chara, expr, combo);
		Father father = new Father();
		boolean isDone = false;
		boolean isValid = false;
		do {
			mother.setName(nameGenerator("Female"));
			mother.motherGenes = parentGeneGenerator();
			father.setName(nameGenerator("Male"));
			father.fatherGenes = parentGeneGenerator();
			childGenes = childGeneGenerator(mother.motherGenes, father.fatherGenes);
			String childName = nameGenerator(genderIdentifier(childGenes));
			System.out
					.println(childName + " is the child of " + mother.mFirstName + " and " + father.fFirstName + ". ");
			System.out.print(pronounGenerator(childName) + " was born with "
					+ expr[0][childExpressionIndex(childGenes, combo, 0)] + " eyes, ");
			System.out.println(expr[1][childExpressionIndex(childGenes, combo, 1)] + " hair, will grow to be "
					+ expr[3][childExpressionIndex(childGenes, combo, 3)] + ", ");
			System.out.print("and will " + sightIdentifier(childGenes, combo, expr));
			System.out.println();
			System.out.println();
			System.out.println("Would you like to run another simulation? Type Y for Yes or N for No?");
			do {
				userInput = sc.next();
				if (userInput.equals("Y") || userInput.equals("N"))
					isValid = true;
				else 
					System.out.println("Only Y and N will be considered as valid inputs. Please try again.");
			} while (isValid == false);
			System.out.println();
			if (userInput.equals("N"))
				isDone = true;

		} while (isDone == false);
		System.out.println("Thank you and have a nice day!");
		sc.close();
	}// main Child

	
	
	//I went crazy with these methods. //
	
	
	private static String nameGenerator(String inGender) {
		String name;
		Random Generator = new Random();
		String[] maleNames = { "John", "Brian", "Peter", "Gibbins", "Tony", "Kyle", "Manny", "Walter", "Steve",
				"Donald" };
		String[] femaleNames = { "Mary", "Wendy", "Abigail", "Lola", "Maria", "Jane", "Jenny", "Penny", "Linda",
				"Shelly" };
		int index = Generator.nextInt(9);
		if (inGender.equals("Male"))
			name = maleNames[index];
		else
			name = femaleNames[index];
		return name;
	}// nameGenerator method

	private static String pronounGenerator(String inName) {
		String pronoun = "She";
		String[] maleNames = { "John", "Brian", "Peter", "Gibbins", "Tony", "Kyle", "Manny", "Walter", "Steve",
				"Donald" };
		for (int i = 0; i < maleNames.length; i++) {
			if (maleNames[i].equals(inName))
				pronoun = "He";
		}
		return pronoun;
	}

	private static String[] parentGeneGenerator() {
		String[] parentGeneratedGenes = new String[5];
		Random Generator = new Random();
		for (int i = 0; i < parentGeneratedGenes.length; i++) {
			int gene = Generator.nextInt(100) + 1;
			if (gene <= 50) {
				parentGeneratedGenes[i] = "D";
			} // if gene <= 50
			else
				parentGeneratedGenes[i] = "R";

		} // for
		return parentGeneratedGenes;
	}// geneGenerator method

	private static String[] childGeneGenerator(String[] inMotherGenes, String[] inFatherGenes) {
		String[] childGenes = new String[5];
		for (int i = 0; i < 5; i++) {
			childGenes[i] = inMotherGenes[i] + inFatherGenes[i];
		} // for
		return childGenes;

	}// childGeneGenerator method

	private static int childExpressionIndex(String[] inChildGenes, String[] comb, int characteristic) {
		int index = 0;
		for (int i = 0; i < comb.length; i++) {
			if (inChildGenes[characteristic].equals(comb[i]))
				index = i;
		} // for i
		return index;

	}// childExpressionIndex method

	private static String genderIdentifier(String[] inChildGenes) {
		if (inChildGenes[3].equals("DD") || inChildGenes[3].equals("RD")) {
			return "Male";
		} else
			return "Female";
	}// genderIdentifier method

	private static String sightIdentifier(String[] inChildGenes, String[] inCombo, String[][] inExpr) {
		String output = null;
		if (childExpressionIndex(inChildGenes, inCombo, 4) == 0)
			output = "have normal vision.";
		else if (childExpressionIndex(inChildGenes, inCombo, 4) == 1
				|| (childExpressionIndex(inChildGenes, inCombo, 4) == 2))
			output = "be " + inExpr[4][childExpressionIndex(inChildGenes, inCombo, 4)] + "sighted.";
		else
			output = "be " + inExpr[4][childExpressionIndex(inChildGenes, inCombo, 4)] + ".";
		return output;
	}// sightIndentifier method

}// class Child
