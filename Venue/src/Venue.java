import java.util.Arrays;
import java.util.Random;
import java.util.Random;
public class Venue {
	Random seatsTakenGenerator = new Random();
	final int INITIAL_SEATS_TAKEN = 100;
	public boolean[][][] allSeats;
	int sections;
	int rows;
	int seats;
	int sectionTaken;
	int rowTaken;
	int seatTaken;
	int generatorCounter = 0;
	
	public Venue(int inSection, int inRow, int inSeat) {
		sections = inSection;
		rows = inRow;
		seats = inSeat;
		allSeats = new boolean [inSection][inRow][inSeat];
		for (int section = 0; section < inSection; section++) {
			for (int row = 0; row < inRow; row++) {
				for (int seat = 0; seat < inSeat; seat++) {
					allSeats[section][row][seat] = false;
				}//for seats
			}// for rows
		}// for sections
	}//Venue constructor
	
	public void seatLookup(int inSection, int inRow, int inSeat) {
		while (generatorCounter < INITIAL_SEATS_TAKEN) {
			sectionTaken = seatsTakenGenerator.nextInt(inSection);
			rowTaken =   seatsTakenGenerator.nextInt(inRow);
			seatTaken =  seatsTakenGenerator.nextInt(inSeat);
			if (allSeats[sectionTaken][rowTaken][seatTaken]== false) {	
				allSeats[sectionTaken][rowTaken][seatTaken] = true;
				//System.out.println(sectionTaken + "-" + rowTaken + "-" + seatTaken + ": index values------- actual values :" +(sectionTaken + 1)+ "-" + (rowTaken+1) + "-" + (seatTaken+1));
				System.out.println((sectionTaken + 1)+ "-" + (rowTaken+1) + "-" + (seatTaken+1) +" was awarded.");
				//System.out.println("generator counter: + " + generatorCounter + ",");
			}//if seat in row and section is not already taken
			else
				System.out.println((sectionTaken + 1)+ "-" + (rowTaken+1) + "-" + (seatTaken+1) +" was already awarded. Sorry!");
			generatorCounter++;
		}
	}
 
}//class
