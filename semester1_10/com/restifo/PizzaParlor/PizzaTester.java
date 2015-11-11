package com.restifo.PizzaParlor;

import java.util.Scanner;

public class PizzaTester
{
	 public static void main(String[] args)
	 {
		 Scanner keyboard = new Scanner(System.in);
		 String name;
		 System.out.print("Please enter your first name: ");
		 name = keyboard.nextLine();
		 PizzaParlor diner = new PizzaParlor(name);

		 System.out.print("The name of your restaurant is: ");
		 System.out.println(diner.getName() + "'s Pizza Parlor");
		 diner.orderCheese();
		 diner.orderCheese();
		 diner.orderCheese();
		 diner.orderPepperoni();
		 diner.orderPepperoni();
		 diner.orderPepperoni();
		 diner.orderPepperoni();
		 diner.orderVeggie();
		 diner.orderVeggie();
		 diner.orderVeggie();
		 System.out.println("# of Cheese ordered is " + diner.getNumCheesePizzas());
		 System.out.println("# of Pepperoni ordered is " + diner.getNumPepperoniPizzas());
		 System.out.println("# of Veggie ordered is " + diner.getNumVeggiePizzas()); 
		 System.out.print("\nRemaining supply of cheese in ounces is: ");
		 System.out.println(diner.getCheeseSupply());
		 System.out.print("Remaining supply of pepperoni in ounces is: ");
		 System.out.println(diner.getPepperoniSupply());
		 System.out.print("Remaining supply of veggies in ounces is: ");
		 System.out.println(diner.getVeggieSupply());
		 System.out.print("Remaining supply of dough in ounces is: ");
		 System.out.print(diner.getDoughSupply());
		 System.out.println("\n\nRevenue is $" + diner.getRevenueTotal());
		 System.out.println("Bank balance is now $"	+ diner.getBankAccountBalance());
		 keyboard.close();
	 }
} 
