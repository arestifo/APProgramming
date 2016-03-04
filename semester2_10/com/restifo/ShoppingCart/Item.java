package com.restifo.ShoppingCart;

import java.text.NumberFormat;

public class Item {
    private String name;
    private double price;
    private int quantity;
    
    public Item(String name, double price, int quantity)
    {
    	this.name = name;
    	this.price = price;
		this.quantity = quantity;
    }
    
    public String toString()
    {
    	NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return (String.format("%s\t%s\t%d\t%s", name, fmt.format(price), quantity, fmt.format(price * quantity)));
    }
    
    public double getPrice() { return price; }
    
    public String getName() { return name; }
    
    public int getQuantity() { return quantity; }
}
