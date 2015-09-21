

// THIS CODE DOESN'T WORK, AND FOR SOME REASON, MY ECLIPSE IS ACTING UP
// SO I CAN'T RUN ANY PROGRAMS TO SEE IF THEY WORK.  NEED ASSISTANCE PLEASE.


package MainPackage;


import java.util.Scanner;

//import org.apache.poi.ss.formula.functions.*;
import org.apache.poi.ss.formula.functions.*;

public class TotalTuitionBill {

	public static void TuitonBillRepaymentCalc(String[] args) {
		
		// Ask the questions for the variables for the payment function		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the initial tuition cost: ");
		double initial_tuition = input.nextDouble();
		
		System.out.print("Enter the percentage increase for tuition: ");
		int tuition_increase = input.nextInt();
		
		System.out.print("Enter the fixed APR for repayment: ");
		double apr = input.nextDouble();
		
		System.out.print("Enter the term you plan to repay"
				+ "your college loan after graduation(years): ");
		int repay_years = input.nextInt();
		double repay_months = repay_years * 12;
		
		// defaults to set for the pmt function
		boolean type = false;
		double arg3 = 0;
		
		// here, I am finding the total tuition bill over 
		double total_tuition = initial_tuition;		
		for (int term = 2; term < 9; term++){
			total_tuition += (initial_tuition*tuition_increase) + initial_tuition;
		}
	}
	// Here is the PMT function to find out the payments each month after graduation
	public static final Function PMT = new FinanceFunction() {
		protected double evaluate(double apr, double repay_months, 
									double total_tuition, double arg3, boolean type) {
			return FinanceLib.pmt(apr, repay_months, total_tuition, arg3, type);
		
		}
		
	};
	

}