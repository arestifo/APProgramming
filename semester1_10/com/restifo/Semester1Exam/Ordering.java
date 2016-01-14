package com.restifo.Semester1Exam;
import static java.lang.System.out;

import java.util.ArrayList;
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
		ArrayList<Integer> cart = new ArrayList<Integer>();
		out.println("Welcome to Oriental Trading online shopping!");
		out.println("\"Useless junk for cheap\"\n");
		
		int menuChoice = 0;
		for (;;)
		{
			switch (menuChoice)
			{
				case 0:
					out.println("        Menu");
					out.println("---------------------");
					out.println("1. View item catalog");
					out.println("2. View item details");
					out.println("3. Checkout");
					out.println("4. Exit");
					out.println("Or, enter an item code to add it to the cart\n");
					out.print("> ");
					menuChoice = inputScan.nextInt();
					break;
				case 1:
					for (int item : manager.getAllProducts())
					{
						out.printf("Item #%d:\t%s\n", item, manager.getProduct(item).getName());
					}
					out.println("\nPress enter to go back;");
					pause();
					menuChoice = 0;
					break;
				case 2:
					out.print("\nEnter an item code: ");
					int code = inputScan.nextInt();
					ProductDetails details = manager.getProduct(code);
					out.printf("Name: %s\n", details.getName());
					out.printf("Description: %s\n", details.getDescription());
					out.printf("Quantity per order: %d\n", details.getQuantityPer());
					break;
				case 3:
					break;
				case 4:
					exit();
				default:
					pause();
					menuChoice = 0;
			}
		}
	}
	private static void pause() { inputScan.nextLine(); inputScan.nextLine(); }
	private static void exit()
	{
		inputScan.close();
		System.exit(0);
	}
}
