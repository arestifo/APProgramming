package com.restifo.BigBucks;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String name = "";
		double deposit = 0.0;
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		while (true)
		{
			out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort): ");
			name = scan.nextLine();
			if (name.toLowerCase().equals("exit"))
			{
				out.println();
				break;
			}
			out.print("Please enter the amount of the deposit: ");
			deposit = Double.parseDouble(scan.nextLine());
			accounts.add(new BankAccount(name, deposit));
			out.println();
		}
		
		double max = 0.0;
		String maxName = "";
		for (BankAccount b : accounts)
		{
			if (b.balance > max)
			{
				max = b.balance;
				maxName = b.name;
			}
		}
		out.printf("The account with the largest balance belongs to %s.\n", maxName);
		out.printf("The amount is $%,.2f", max);
		
		scan.close();
	}
}
