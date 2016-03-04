import java.util.Scanner;
public class Prog9 {

	public static void main(String[] args) {
		System.out.println("Input payroll information, starting with ID number, then gross pay, then state tax, then federal tax, then FICA withholdings. If you enter a 0 for ID, the payroll report will be printed.");
		Scanner input = new Scanner(System.in);
		int IDnum;
		double grossPay, stateTax, federalTax, withholdings;
		boolean endPayroll = false;
		while (!endPayroll) {
			IDnum = input.nextInt();
			if (IDnum == 0) {
				endPayroll = true;
				System.out.println("Sentinel value detected, ending input.");
			}
			else {
				grossPay = input.nextDouble();
				do {
				do {
				stateTax = input.nextDouble();
					if (stateTax > grossPay || stateTax < 0) {
						System.out.println("You entered a negative value for the deduction or a larger value than the gross pay. Try again.");
					}
				}
				while (stateTax > grossPay);
				
				do {
				federalTax = input.nextDouble();
					if (federalTax > grossPay || federalTax < 0) {
						System.out.println("You entered a negative value for the deduction or a larger value than the gross pay. Try again.");
					}
				}
				while (federalTax > grossPay);
				
				do {
				withholdings = input.nextDouble();
					if (withholdings > grossPay || withholdings < 0) {
						System.out.println("You entered a negative value for the deduction or a larger value than the gross pay. Try again.");
					}
				}
				while (withholdings > grossPay);
				if (grossPay < stateTax + federalTax + withholdings) {
					System.out.println("Deductions are larger than gross pay... try again please.");
				}
				}
				while (grossPay < stateTax + federalTax + withholdings);
				System.out.println("Employee " + IDnum + "'s payroll successfully created.");
				Payroll myPayroll = new Payroll(IDnum, grossPay, stateTax, federalTax, withholdings);
				System.out.println(myPayroll.toString());
			}
		}
		
	}

}
