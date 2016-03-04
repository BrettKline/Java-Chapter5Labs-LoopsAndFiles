import java.util.Scanner;
public class Prog7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many years will you record rainfall?");
		int totalMonths = 0, totalRain = 0, thisRain = 0, numYears = 0;
		double avgRain = 0.0;
		
		do {
			numYears = input.nextInt();
			if (numYears <= 0) {
				System.out.println("Please input a positive integer for number of years.");
			}
		}
		while (numYears <= 0);
		for (int yearCounter = 1; yearCounter <= numYears; yearCounter++) {
			for (int monthCounter = 1; monthCounter <= 12; monthCounter++) {
				System.out.println("Rainfall for Year " + yearCounter + ", month " + monthCounter);
				thisRain = input.nextInt();
				totalRain += thisRain;
				totalMonths++;
			}
		}
		avgRain = (double)totalRain / (double)totalMonths;
		System.out.println("Total rain over " + totalMonths +" months: " + totalRain + ". Average rainfall: " + avgRain + ".");
		input.close();
	}

}
