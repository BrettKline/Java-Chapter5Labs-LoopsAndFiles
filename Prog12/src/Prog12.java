import java.util.Scanner;
public class Prog12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input store 1's sales dollars.");
		double store1 = input.nextDouble();
		System.out.println("Input store 2's sales dollars.");
		double store2 = input.nextDouble();
		System.out.println("Input store 3's sales dollars.");
		double store3 = input.nextDouble();
		System.out.println("Input store 4's sales dollars.");
		double store4 = input.nextDouble();
		System.out.println("Input store 5's sales dollars.");
		double store5 = input.nextDouble();
		int counter = 0;
		System.out.println("\r\nStore 1's star chart: ");
		for(counter = 0; counter < store1 / 100; counter++) {
			System.out.print("*");
		}
		System.out.println("\r\nStore 2's star chart: ");
		for(counter = 0; counter < store2 / 100; counter++) {
			System.out.print("*");
		}
		System.out.println("\r\nStore 3's star chart: ");
		for(counter = 0; counter < store3 / 100; counter++) {
			System.out.print("*");
		}
		System.out.println("\r\nStore 4's star chart: ");
		for(counter = 0; counter < store4 / 100; counter++) {
			System.out.print("*");
		}
		System.out.println("\r\nStore 5's star chart: ");
		for(counter = 0; counter < store5 / 100; counter++) {
			System.out.print("*");
		}
		input.close();
	}

}
