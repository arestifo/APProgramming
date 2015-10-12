package com.restifo.Taxes;
import static java.lang.System.out;

import java.util.Scanner;
public class Taxes {
	private static final double FED_TAX = 0.85;
	private static final double FICA_TAX = 0.9235;
	private static final double STATE_TAX = 0.96;
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		out.print("Hours worked: ");
		int hours = scan.nextInt();
		
		out.print("Hourly rate: ");
		double rate = scan.nextDouble();
		
		double grossPay = hours * rate;
		double netPay = grossPay * FED_TAX * FICA_TAX * STATE_TAX;
		out.printf("\nHours worked\t\t%d\n", hours);
		out.printf("Hourly rate\t\t%.2f\n\n", rate);
		out.printf("Gross pay\t\t%.2f\n\n", grossPay);
		out.printf("Federal Tax (15%%)\t%.2f\n", grossPay * 0.15);
		out.printf("FICA (7.65%%)\t\t%.2f\n", grossPay * 0.0765);
		out.printf("Federal Tax (15%%)\t%.2f\n\n", grossPay * 0.04);
		out.printf("Net pay\t\t\t%.2f", netPay);
		scan.close();
	}
}
