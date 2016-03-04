package com.restifo.ShoppingCart;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
	public static void main (String[] args)
	{
		String name;
		String keepShopping = "y";
		Scanner scan = new Scanner(System.in);
		ArrayList<Item> cart = new ArrayList<Item>();
		double price;
		int quantity;

		do
		{
			out.print ("Enter the name of the item: ");
			name = scan.nextLine();
			
			out.print ("Enter the unit price: ");
			price = scan.nextDouble();
			
			out.print ("Enter the quantity: ");
			quantity = scan.nextInt();
			
			cart.add(new Item(name, price, quantity));
			out.println("Cart contents:");
			for (Item i : cart)
			{
				out.println(i.toString());
			}
			
			out.print("Continue shopping (y/n)? ");
			keepShopping = scan.nextLine();
		} while (keepShopping.equals("y"));
		
		scan.close();
	}
}