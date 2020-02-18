
import java.util.Arrays;
import java.util.Scanner;

public class VenueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sections = 0;
		int rows = 0;
		int seats = 0;
		int awardedSection = 0;
		int awardedRow = 0;
		int awardedSeat = 0;
		String awarded;
		System.out.println("How many sections does the venue have?");
		sections = sc.nextInt();
		System.out.println("How many rows does each section have?");
		rows = sc.nextInt();
		System.out.println("How many seats does each row have?");
		seats = sc.nextInt();
		Venue PrudentialCenter = new Venue(sections, rows, seats);
		System.out.println();
		System.out.println("Which section would you like to be awarded?");
		awardedSection = sc.nextInt();
		System.out.println("Which row for the section would you like to be awarded?");
		awardedRow = sc.nextInt();
		System.out.println("Which seat for the row would you like to be awarded?");
		awardedSeat = sc.nextInt();
		awarded = PrudentialCenter.seatLookup(awardedSection, awardedRow, awardedSeat);
		System.out.println(awardedSection + "-" + awardedRow + "-" + awardedSeat + "" + awarded);
		
		
	}//main
}//class
