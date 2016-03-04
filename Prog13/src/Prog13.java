import java.util.Scanner;
public class Prog13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double f = 0;
		for (double c = 0; c <= 20; c++) {
			f = (c * (9.0/5.0)) + 32;
			System.out.println(c + " degrees centigrade is equal to " + f + " degrees farenheit.");
		}
		input.close();
	}

}
