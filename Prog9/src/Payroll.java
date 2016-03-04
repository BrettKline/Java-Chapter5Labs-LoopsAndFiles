
public class Payroll {
	private int IDNum;
	private double grossPay;
	private double stateTax;
	private double federalTax;
	private double withholdings;
	public Payroll(int IDNum, double grossPay, double stateTax, double federalTax, double withholdings) {
		this.IDNum = IDNum;
		this.grossPay = grossPay;
		this.stateTax = stateTax;
		this.federalTax = federalTax;
		this.withholdings = withholdings;
	}
	@Override
	public String toString() {
		return "Payroll [IDNum=" + IDNum + ", grossPay=" + grossPay + ", stateTax=" + stateTax + ", federalTax="
				+ federalTax + ", withholdings=" + withholdings + ", netPay=" + getNetPay() + "]";
	}
	public double getNetPay() {
		
		return grossPay - stateTax - federalTax - withholdings;
	}
	
}
