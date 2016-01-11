package com.restifo.Semester1Exam;

@SuppressWarnings("unused")
public class Product {
	private String name;
	private String description;
	private int itemCode;
	private int quantityPer;
	private double price;
	public Product(String name, String description, int itemCode, int quantityPer, double price)
	{
		this.name = name;
		this.description = description;
		this.itemCode = itemCode;
		this.quantityPer = quantityPer;
		this.price = price;
	}
	private String getName() { return name; }
	private String getDescription() { return description; }
	private int getItemCode() { return itemCode; }
	private int getQuantityPer() { return quantityPer; }
	private double getPrice() { return price; }
}
