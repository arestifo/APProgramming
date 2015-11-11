package com.restifo.PizzaParlor;

public class PizzaParlor
{
	 private String myName;
	 private int myNumCheesePizzas;
	 private int myNumPeppPizzas;
	 private int myNumVegPizzas;
	 private int myCheeseSupply; 
	 private int myPepperoniSupply;
	 private int myVeggieSupply; 
	 private int myDoughSupply;
	 private double myRevenue; 
	 private double myOrigAcctBal;
	 
	 public PizzaParlor(String name)
	 {
		 myName = name;
		 myNumCheesePizzas = 0;
		 myNumPeppPizzas = 0;
		 myNumVegPizzas = 0;
		 myCheeseSupply = 400;
		 myPepperoniSupply = 200;
		 myVeggieSupply = 200;
		 myDoughSupply = 400;
		 myRevenue = 0;
		 myOrigAcctBal = 1000;
	 }
	 
	 public void orderCheese()
	 {
		 myNumCheesePizzas++;
		 myRevenue += 8;
		 myCheeseSupply -= 12;
		 myDoughSupply -= 11;
	 }
	 public void orderPepperoni()
	 {
		 myNumPeppPizzas++;
		 myRevenue += 10;
		 myCheeseSupply -= 8;
		 myPepperoniSupply -= 6;
		 myDoughSupply -= 11;
	 }
	 public void orderVeggie()
	 {
		 myNumVegPizzas++;
		 myRevenue += 11;
		 myCheeseSupply -= 8;
		 myVeggieSupply -= 12;
		 myDoughSupply -= 11;
	 }
	 public String getName() { return myName; }
	 public int getNumCheesePizzas() { return myNumCheesePizzas; }
	 public int getNumPepperoniPizzas() { return myNumPeppPizzas; }
	 public int getNumVeggiePizzas() { return myNumVegPizzas; }
	 public int getCheeseSupply() { return myCheeseSupply; }
	 public int getPepperoniSupply() { return myPepperoniSupply; }
	 public int getVeggieSupply() { return myVeggieSupply; }
	 public int getDoughSupply() { return myDoughSupply; }
	 public double getRevenueTotal() { return myRevenue; }
	 public double getBankAccountBalance() { return myOrigAcctBal + myRevenue; }
} 