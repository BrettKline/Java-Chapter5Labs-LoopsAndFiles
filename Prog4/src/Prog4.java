import java.util.Scanner;
public class Prog4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many days did you request the emperor of India to pay you in pennies?");
		int days;
		do {
			days = input.nextInt();
			if (days < 1) {
				System.out.println("No, it has to be at least one. Seriously.");
			}
		}
		while (days < 1);
		for (double c = 1.0, money = 0.01, moneySum = 0.01; c <= days; c++) {
			System.out.printf("Day %.0f: Earned $%.2f today, $%.2f total\r\n", c, money, moneySum);
			money *= 2;
			moneySum += money;
		}
		if (days == 64) {
			System.out.println("What a good deal for inventing chess!");
		}
		
		input.close();
	}

}
