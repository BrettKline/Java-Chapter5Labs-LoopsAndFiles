import java.util.Scanner;

//TODO: MAKE THIS WORK WITH IO

public class Prog3 {
	public static double getDistance(double speed, int time) {
		
		return speed * time;
	}
	public static void main(String[] args) {
		System.out.println("Input a speed (in mph) and a length of time (in hours). Speed should be any positive number, and time should be an integer greater than zero.");
		Scanner input = new Scanner(System.in);
		double myTime;
		int mySpeed;
		boolean inputIsBad;
		do {
			mySpeed = input.nextInt();
			myTime = input.nextDouble();
			inputIsBad = false;
			if (myTime < 1 || mySpeed <= 0) {
				inputIsBad = true;
				if (myTime < 1) {
					System.out.println("Your input for time of " + myTime + " is outside the specified range. It should be an integer greater than zero.");
				}
				if (mySpeed <= 0) {
					System.out.println("Your input for speed of " + mySpeed + " is outside the specified range. It should be any positive number.");
				}
			}
		}
		while (inputIsBad);
		
		for (int c = 1; c <= myTime; c++) {
			System.out.println("Hour " + c + ": " + getDistance(mySpeed, c) + " miles");
		}
		
		//input.close();
	}

}
