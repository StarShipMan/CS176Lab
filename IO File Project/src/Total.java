import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Total {

	public static void main(String[] args) throws FileNotFoundException {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the file name that you would like to process a total for?");
		String fileName = sc.next();
		File numbers = new File(fileName);
		sc.close();
		outputTotal(numbers);
		}
		catch (FileNotFoundException exception) {
			System.out.println("Sorry, that file does not exist");
		}
	}//main
	public static void outputTotal(File inFileName) throws FileNotFoundException {
		PrintWriter total = new PrintWriter("total.txt");
		Scanner file = new Scanner(inFileName);
		double sum = 0;
		while(file.hasNext()) {
			sum = sum + Double.parseDouble(file.nextLine());
		}
		file.close();
		total.println("Sum: " + sum);
		total.close();
	}
}//class
