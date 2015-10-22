package com.restifo.IRS;
import static java.lang.System.out;
import java.util.Scanner;
public class IRS {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String s = "";
		while (!(s.equals("s") || s.equals("m")))
		{
			out.print("Enter filing status (s for single, m for married): ");
			s = scan.nextLine();
		}
		out.print("Enter your taxable income ($): ");
		double income = scan.nextDouble();
		double tax = 0;
		if (s.equals("s"))
		{
			if (income <= 27050)
				tax = income * 0.15;
			else if (income > 27050 && income <= 65500)
				tax = 4057 + (income - 27050) * 0.275;
			else if (income > 65500 && income <= 136750)
				tax = 14645 + (income - 65500) * 0.305;
			else if (income > 136750 && income <= 297350)
				tax = 36361 + (income - 136750) * 0.355;
			else
				tax = 93374 + (income - 297350) * 0.391;
		}
		else
		{
			if (income <= 45200)
				tax = income * 0.15;
			else if (income > 45200 && income <= 109250)
				tax = 6780 + (income - 45200) * 0.275;
			else if (income > 109250 && income <= 166500)
				tax = 24393.75 + (income - 109250) * 0.305;
			else if (income > 166500 && income <= 297350)
				tax = 41855 + (income - 166500) * 0.355;
			else
				tax = 88306 + (income - 297350) * 0.391;
		}
		
		out.println("\nFiling status: " + (s.equals("s") ? "Single" : "Married" ));
		out.printf("Taxable income = $%,.2f\n", income);
		out.printf("Federal tax = $%,.2f", tax);
		scan.close();
	}
}
