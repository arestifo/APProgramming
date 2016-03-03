package com.restifo.ShoppingCart;
import static java.lang.System.out;

import java.util.Scanner;
@SuppressWarnings("unused")
public class Shop
{
	public static void main (String[] args)
	{
		//Item item;
		String itemName;
		double itemPrice;
		int quantity;
		Scanner scan = new Scanner(System.in);
		String keepShopping = "y";
		do
		{
			out.print ("Enter the name of the item: ");
			itemName = scan.nextLine();
			out.print ("Enter the unit price: ");
			itemPrice = scan.nextDouble();
			out.print ("Enter the quantity: ");
			quantity = scan.nextInt();
			// *** create a new item and add it to the cart
			// *** print the contents of the cart object using println
			out.print("Continue shopping (y/n)? ");
			keepShopping = scan.nextLine();
		}
		while (keepShopping.equals("y"));
		scan.close();
	}
}