package com.restifo.Semester1Exam;

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
	public String getName() { return name; }
	public String getDescription() { return description; }
	public int getQuantityPer() { return quantityPer; }
	public double getPrice() { return price; }
}
