package com.restifo.Loan;
import static java.lang.System.out;

import java.util.Scanner;
public class Loan {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		out.print("Amount of the loan: ");
		double amt = scan.nextDouble();
		out.print("Length of loan in years: ");
		int years = scan.nextInt();
		out.print("Low interest rate in %: ");
		double low = scan.nextDouble();
		out.print("High interest rate in %: ");
		double high = scan.nextDouble();
		double count = low;
		out.println("\nAnnual interest rate     Monthly payments");
		out.println("--------------------     ----------------");
		while (count <= high)
		{
			double monthly = count / 12.0;
			double a = amt * (monthly) / (1 - (Math.pow(1 / (1 + monthly), years * 12)));
			out.printf("%,.2f\t\t\t $%,.2f\n", count, a);
			count += 0.25;
		}
		scan.close();
	}
}
