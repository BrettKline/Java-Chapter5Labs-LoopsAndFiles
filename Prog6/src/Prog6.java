import java.util.Scanner;
public class Prog6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The local germ population is growing! Tell me: \r\n1. how many germs we started with, \r\n2. average daily population increase (as a percent), and \r\n3. how many days they will grow for.");
		boolean isBadData;
		double numGerms, growthGerms, daysGerms;
		do {
		isBadData = false;	
			numGerms = input.nextDouble();
			growthGerms = input.nextDouble();
			daysGerms = input.nextDouble();
			if (numGerms < 2 || growthGerms < 0 || daysGerms < 1) {
				isBadData = true;
				System.out.println("Error: your inputted data won't create a logical result. Try again.");
			}
		}
		while (isBadData);
		double growthResult = 0;
		for (int counter = 0; counter < daysGerms; counter++) {
			growthResult = numGerms * growthGerms;
			
			System.out.printf("On day %d: We started with %f germs, grew by %f, ending with %f.\r\n", counter+1, numGerms, growthResult, numGerms + growthResult);
			numGerms += growthResult;
		}
		input.close();
			
	}

}
