import java.util.Scanner;

public class ComboLockTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int correctFirst = 10;
		final int correctSecond = 20;
		final int correctThird = 30;
		boolean isDone = false;
		String stringTicks;
		int ticks;
		ComboLock lock = new ComboLock(correctFirst, correctSecond, correctThird);
		System.out.println("First Attempt");
		System.out.println("Enter number of ticks to turn to the right 0-39. Enter an invalid number to quit.");
		stringTicks = sc.next();
		while (isDone == false) {
			for (int i = 0; i < stringTicks.length(); i++) {
				if (!Character.isDigit(stringTicks.charAt(i))) {
					isDone = true;
				}
			}
			if (isDone == true) {
				System.out.println("Thank you, have a good day!");
			}
			if (isDone == false) {
				if (!(((Integer.parseInt(stringTicks)) < 40) && ((Integer.parseInt(stringTicks)) > 0))) {
					System.out.println("Thank you, have a good day!");
					isDone = true;
				} else if (((Integer.parseInt(stringTicks)) < 40) && ((Integer.parseInt(stringTicks)) > 0)) {
					ticks = Integer.parseInt(stringTicks);
					lock.turnRight(ticks);
				}
				if (isDone == false) {
					System.out.println(
							"Enter number of ticks to turn to the left 0-39. Enter an invalid number to quit.");
					stringTicks = sc.next();
					if (!(((Integer.parseInt(stringTicks)) < 40) && ((Integer.parseInt(stringTicks)) > 0))) {
						System.out.println("Thank you, have a good day!");
						isDone = true;
					} else if (((Integer.parseInt(stringTicks)) < 40) && ((Integer.parseInt(stringTicks)) > 0)) {
						ticks = Integer.parseInt(stringTicks);
						lock.turnLeft(ticks);
					}
				}
				if (isDone == false) {
					System.out.println(
							"Enter number of ticks to turn to the right 0-39. Enter an invalid number to quit.");
					stringTicks = sc.next();
					if (!(((Integer.parseInt(stringTicks)) < 40) && ((Integer.parseInt(stringTicks)) > 0))) {
						System.out.println("Thank you, have a good day!");
						isDone = true;
					} else if (((Integer.parseInt(stringTicks)) < 40) && ((Integer.parseInt(stringTicks)) > 0)) {
						ticks = Integer.parseInt(stringTicks);
						lock.turnRight(ticks);
					}
				}
				if (isDone == false) {
					if (lock.open()) {
						System.out.println("You opened the lock!");
						isDone = true;
					} else {
						System.out.println("You did not open the lock!");
						isDone = true;
					}
				}
			}
		} // while loop for first attempt
		isDone = false;
		System.out.println();
		lock.reset();
		System.out.println("Second Attempt");
		System.out.println("Enter number of ticks to turn to the right 0-39. Enter an invalid number to quit.");
		stringTicks = sc.next();
		while (isDone == false) {
			for (int i = 0; i < stringTicks.length(); i++) {
				if (!Character.isDigit(stringTicks.charAt(i))) {
					isDone = true;
				}
			}
			if (isDone == true) {
				System.out.println("Thank you, have a good day!");
			}
			if (isDone == false) {
				if (!(((Integer.parseInt(stringTicks)) < 40) && ((Integer.parseInt(stringTicks)) > 0))) {
					System.out.println("Thank you, have a good day!");
					isDone = true;
				} else if (((Integer.parseInt(stringTicks)) < 40) && ((Integer.parseInt(stringTicks)) > 0)) {
					ticks = Integer.parseInt(stringTicks);
					lock.turnRight(ticks);
				}
				if (isDone == false) {
					System.out.println(
							"Enter number of ticks to turn to the left 0-39. Enter an invalid number to quit.");
					stringTicks = sc.next();
					if (!(((Integer.parseInt(stringTicks)) < 40) && ((Integer.parseInt(stringTicks)) > 0))) {
						System.out.println("Thank you, have a good day!");
						isDone = true;
					} else if (((Integer.parseInt(stringTicks)) < 40) && ((Integer.parseInt(stringTicks)) > 0)) {
						ticks = Integer.parseInt(stringTicks);
						lock.turnLeft(ticks);
					}
				}
				if (isDone == false) {
					System.out.println(
							"Enter number of ticks to turn to the right 0-39. Enter an invalid number to quit.");
					stringTicks = sc.next();
					if (!(((Integer.parseInt(stringTicks)) < 40) && ((Integer.parseInt(stringTicks)) > 0))) {
						System.out.println("Thank you, have a good day!");
						isDone = true;
					} else if (((Integer.parseInt(stringTicks)) < 40) && ((Integer.parseInt(stringTicks)) > 0)) {
						ticks = Integer.parseInt(stringTicks);
						lock.turnRight(ticks);
					}
				}
				if (isDone == false) {
					if (lock.open()) {
						System.out.println("You opened the lock!");
						isDone = true;
					} else {
						System.out.println("You did not open the lock!");
						isDone = true;
					}
				}
			}
		} // while loop for second attempt

	}// main

}// class
