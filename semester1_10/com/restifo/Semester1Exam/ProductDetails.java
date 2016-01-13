package com.restifo.Semester1Exam;

@SuppressWarnings("unused")
public class ProductDetails {
	private String name;
	private String description;
	private int quantityPer;
	private double price;
	public ProductDetails(String name, String description, int quantityPer, double price)
	{
		this.name = name;
		this.description = description;
		this.quantityPer = quantityPer;
		this.price = price;
	}
	private String getName() { return name; }
	private String getDescription() { return description; }
	private int getQuantityPer() { return quantityPer; }
	private double getPrice() { return price; }
}
