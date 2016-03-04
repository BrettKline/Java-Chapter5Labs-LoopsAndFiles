import java.util.Scanner;
public class Prog8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers, as many as you want. When you get bored, enter -99.");
		int inputNum = 0, bigNum = 1999999999, smallNum = -1999999999;
		boolean stop = false;
		do {
			inputNum = input.nextInt();
			if (inputNum == -99) {
				stop = true;
			}
			else if (inputNum < smallNum || smallNum == -1999999999) {
				smallNum = inputNum;
			}
			if (inputNum > bigNum || bigNum == 1999999999) {
				bigNum = inputNum;
			}
		}
		while (!stop);
		System.out.println("Biggest number: " + bigNum + ", smallest number: " + smallNum);
		input.close();
	}

}
