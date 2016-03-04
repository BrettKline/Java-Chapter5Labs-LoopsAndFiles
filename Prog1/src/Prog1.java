import java.util.Scanner;
public class Prog1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 1, fullSum = 0, toSum = 0;
		System.out.println("What number (integers only) would you like to summate?");
		toSum = input.nextInt();
		while (counter <= toSum ) {
			fullSum += counter;
			counter++;
		}
		System.out.println(fullSum);
		input.close();
	}

}
