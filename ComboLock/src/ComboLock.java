
public class ComboLock {
	int correctFirst;
	int correctSecond;
	int correctThird;
	int currentPosition= 0;
	boolean firstIsCorrect = false;
	boolean secondIsCorrect = false;
	boolean thirdIsCorrect = false;
	boolean isOpen= false;
	public ComboLock(int inSecret1, int inSecret2, int inSecret3) {
		correctFirst = inSecret1;
		correctSecond = inSecret2;
		correctThird = inSecret3;
		
	}//ComboLock Constructor
	
	public void reset() {
		currentPosition = 0;
		firstIsCorrect = false;
		secondIsCorrect = false;
		thirdIsCorrect = false;
		isOpen= false;
	}//reset method
	
	public void turnLeft(int inTicks) {
		for(int i = 1; i <= inTicks; i++) {
			if (currentPosition == 40) {
				currentPosition = 0;
			}// currentPosition == 40
			currentPosition++;
			//System.out.print(currentPosition);
		}//for loop
		if (firstIsCorrect == true) {
			if (currentPosition == correctSecond) {
				secondIsCorrect = true;
			}//if currentPosition == correctFirst
		}//firstIsCorrect == false
	}//turnLeft method
	
	public void turnRight( int inTicks) {
		for(int i = 1; i <= inTicks; i++) {
			if (currentPosition == 0) {
				currentPosition = 40;
			}//if currentPosition == 0
			currentPosition--;
			//System.out.print(currentPosition);
		}//for loop
		if (firstIsCorrect == false) {
			if (currentPosition == correctFirst) {
				firstIsCorrect = true;
			}//if currentPosition == correctFirst
		}//if firstIsCorrect == false
		else if (firstIsCorrect == true) {
			if (currentPosition == correctThird) {
				thirdIsCorrect = true;
			}//if currentPosition == correctThird
		}//else if firstISCorrect == true
	}//turnRight method
	
	public boolean open() {
		if (firstIsCorrect && secondIsCorrect && thirdIsCorrect) {
			isOpen = true;
		}
		return isOpen;
	}//open method
	
}//class
