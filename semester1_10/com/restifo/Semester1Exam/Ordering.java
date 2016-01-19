package com.restifo.Semester1Exam;
import static java.lang.System.out;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
/* Alex Restifo
 * 1/11/2015
 * Period 5 Programming
 * Oriental trading online shopping program
 * Version 1.2
 */
@SuppressWarnings("serial")
public class Ordering {
	private static Scanner inputScan = new Scanner(System.in);
	private static ProductManager manager = new ProductManager();
	private static Map<Integer, Integer> cart = new LinkedHashMap<Integer, Integer>();
	private static Map<Integer, Object[]> shipping = new LinkedHashMap<Integer, Object[]>()	
	{{
		put(1, new Object[]{"Free shipping (8-10 days)", 0});
		put(2, new Object[]{"2 day shipping (2-4 days)", 30});
		put(3, new Object[]{"Overnight shipping (2 days)", 60});
	}};
	private static Random rand = new Random();
	public static void main(String[] args)
	{
		out.println("Welcome to Oriental Trading online shopping!");
		out.println("\"Party supplies for cheap!\"\n");
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
					menuChoice = 0;
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
		out.print("Is your order correct (y/n) "); inputScan.nextLine();
		String answer = inputScan.nextLine();
		if (!answer.equals("y")) return;
		
		out.println("Enter your shipping info:");
		out.print("Name: ");
		inputScan.nextLine();
		out.print("Address: ");
		String address = inputScan.nextLine();
		out.print("Phone #: ");
		inputScan.nextLine();
		out.print("Email: ");
		inputScan.nextLine();
		
		out.println("\nWhich shipping option?");
		for (int i = 1; i < shipping.size() + 1; i++)
		{
			Object[] shipOption = shipping.get(i);
			out.printf("%d: %s ($%d)\n", i, shipOption[0], shipOption[1]);
		}
		out.print("> ");
		int shipCost = (int)shipping.get(inputScan.nextInt())[1];
		String state = address.split(" ")[address.split(" ").length - 2];
		double tax = manager.getTax(state);
		viewCart(true);
		out.printf("| Shipping:\t\t\t\t     $%d%s|\n", shipCost, shipCost == 0 ? "\t" : "     ");
		out.printf("| State tax:\t\t\t\t     %.2f%%%s|\n", tax, tax != 0 && tax < 10 ? "   " : tax == 0 ? "\t" : "  ");
		out.println("|                                                    |");
		double total = (getSubtotal() + shipCost) * (1 + tax / 100);
		out.printf("| Total:\t\t\t\t     $%.2f  |\n", total);
		out.println("\\----------------------------------------------------/");
		out.print("Place order? (y/n) ");
		String confirm = inputScan.nextLine();
		if (!confirm.equals("y")) return;
		
		out.println("\nOrder placed! Your order # is " + rand.nextInt(9999) + 1);
		out.println("Thanks for shopping with us!!");
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
		out.println("/------------------------\\");
		out.printf("|          Menu          |  [Cart: %d item%s]\n", getCartAmt(), getCartAmt() != 1 ? "s" : "");
		out.println("|------------------------|");
		out.println("| 1. View item catalog   |");
		out.println("| 2. Lookup item details |");
		out.println("| 3. View cart           |");
		out.println("| 4. Checkout            |");
		out.println("| 5. Exit                |");
		out.println("\\------------------------/");
		out.println("Or, enter an item code to add it to the cart\n");
		out.print("> ");
	}
	
	private static void exit()
	{
		inputScan.close();
		System.exit(0);
	}
}
