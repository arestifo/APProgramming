package com.restifo.Semester1Exam;
import static java.lang.System.out;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
/* Alex Restifo
 * 1/11/2015
 * Period 5 Programming
 * Oriental trading online shopping program
 * Version 1.0
 */
public class Ordering {
	private static Scanner inputScan = new Scanner(System.in);
	private static ProductManager manager = new ProductManager();
	private static Map<Integer, Integer> cart = new LinkedHashMap<Integer, Integer>();
	public static void main(String[] args)
	{
		out.println("Welcome to Oriental Trading online shopping!");
		out.println("\"Useless junk for cheap\"\n");
		int menuChoice = 0;
		for (;;)
		{
			switch (menuChoice)
			{
				case 0:
					showMenu();
					menuChoice = inputScan.nextInt();
					break;
				case 1:
					for (int item : manager.getAllProducts())
					{
						out.printf("Item #%d:\t%s\n", item, manager.getProduct(item).getName());
					}
					out.println("\nPress enter to go back");
					pause();
					menuChoice = 0;
					break;
				case 2:
					showItemDetails();
					pause();
					menuChoice = 0;
					break;
				case 3:
					viewCart(false);
					out.println("Press enter to go back");
					pause();
					menuChoice = 0;
					break;
				case 4:
					checkout();
					break;
				case 5:
					exit();
				default:
					addItemToCart(menuChoice);
					menuChoice = 0;
			}
		}
	}
	private static void pause() { inputScan.nextLine(); inputScan.nextLine(); }
	
	private static void checkout()
	{
		viewCart(false);
		out.print("Is your order correct (y/n) ");
		String answer = inputScan.nextLine();
		if (answer.equals("n")) return;
		
		String name, address, telephone, email;
		out.println("Enter your shipping info:");
		out.print("Name: ");
		name = inputScan.nextLine();
		out.print("Address: ");
		address = inputScan.nextLine();
		out.print("Phone #: ");
		telephone = inputScan.nextLine();
		out.print("Email: ");
		email = inputScan.nextLine();
		out.print("Enter state (ex. MD for Maryland): ");
		String state = inputScan.nextLine();
		double tax = manager.getTax(state);
		
	}
	
	private static void viewCart(boolean checkout)
	{
		out.println("                     Your cart                      ");
		out.println("/----------------------------------------------------\\");
		out.println("| Item# |         Name          | Quantity |  Price  |");
		out.println("|----------------------------------------------------|");
		int[] nums = cart.keySet().stream().mapToInt(x -> x).toArray();
		ProductDetails[] allDetails = new ProductDetails[nums.length];
		for (int i = 0; i < nums.length; i++)
			allDetails[i] = manager.getProduct(nums[i]);
		for (int i = 0; i < allDetails.length; i++)
		{
			String name = allDetails[i].getName();
			out.printf("| %d\t| %s\t|  %d       | $%.2f  |\n", nums[i], name.length() > 17 ? name.substring(0, 17).trim().concat("...") : name, cart.get(nums[i]), (allDetails[i].getPrice() * cart.get(nums[i])));
		}
		out.println("|                                                    |");
		out.printf("| Subtotal:\t\t\t\t     $%.2f  |\n", getSubtotal());
		if (!checkout)
		{
			out.println("\\----------------------------------------------------/");
		}
	}
	
	private static double getSubtotal()
	{
		double subtotal = 0;
		for (int item : cart.keySet())
		{
			subtotal += manager.getProduct(item).getPrice() * cart.get(item);
		}
		return subtotal;
	}
	
	private static int getCartAmt()
	{
		int amt = 0;
		for (int item : cart.keySet())
		{
			amt += cart.get(item);
		}
		return amt;
	}
	
	private static void addItemToCart(int item)
	{
		if (!manager.productExists(item))
		{
			out.println("Product does not exist!");
			out.println("Press enter to go back");
			pause();
			return;
		}
		out.print("How many units? ");
		int units = inputScan.nextInt();
		if (cart.containsKey(item))
			cart.put(item, cart.get(item) + units);
		else
			cart.put(item, units);
		String name = manager.getProduct(item).getName();
		out.printf("Added %d %s%s to cart\n\n", units, name, units > 1 && !(name.charAt(name.length() - 1) == 's') ? "s" : "");
	}
	
	private static void showItemDetails()
	{
		out.print("\nEnter an item code: ");
		int code = inputScan.nextInt();
		ProductDetails details = manager.getProduct(code);
		out.printf("Name: %s\n", details.getName());
		out.printf("Description: %s\n", details.getDescription());
		out.printf("Quantity per order: %d\n", details.getQuantityPer());
		out.printf("Price per order: $%.2f", details.getPrice());
		out.println("\nPress enter to go back");
	}
	
	private static void showMenu()
	{
		out.printf("        Menu \t\t[Cart: %d item%s]\n", getCartAmt(), getCartAmt() != 1 ? "s" : "");
		out.println("---------------------");
		out.println("1. View item catalog");
		out.println("2. View item details");
		out.println("3. View cart");
		out.println("4. Checkout");
		out.println("5. Exit");
		out.println("Or, enter an item code to add it to the cart\n");
		out.print("> ");
	}
	
	private static void exit()
	{
		inputScan.close();
		System.exit(0);
	}
}
