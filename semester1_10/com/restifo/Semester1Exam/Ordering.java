package com.restifo.Semester1Exam;
import static java.lang.System.out;

import java.util.Scanner;
/* Alex Restifo
 * 1/11/2015
 * Period 5 Programming
 * Oriental trading online shopping program
 * Version 1.0
 */
public class Ordering {
	private static Scanner inputScan = new Scanner(System.in);
	public static void main(String[] args)
	{
		ProductManager manager = new ProductManager();
		out.println("Welcome to Oriental Trading online shopping!");
		out.println("\"Useless junk for cheap\"");
		
		int menuChoice = 0;
		for (;;)
		{
			switch (menuChoice)
			{
				case 0:
					out.println("Menu");
					out.println("---------");
					out.println("1. View item catalog");
					out.println("2. View item details");
					out.println("3. View shopping cart");
					out.println("4. Exit\n");
					out.print("> ");
					menuChoice = inputScan.nextInt();
					break;
				case 1:
					for (int i : manager.getAllProducts())
						out.println(i);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					exit();
			}
		}
	}
	
	private static void exit()
	{
		inputScan.close();
		System.exit(0);
	}
}
