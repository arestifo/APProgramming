package com.restifo.Circle;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args)
	{
		final double PI = 3.14159;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a value for the radius: ");
		int radius = scan.nextInt();
		double area1 = PI * radius * radius;
		double circ1 = 2 * PI * radius;
		System.out.println("\nThe area of a circle with radius " + radius + " is " + area1);
		System.out.println("The circumference of a circle with radius " + radius + " is " + circ1);
		
		radius *= 2;
		double area2 = PI * radius * radius;
		double circ2 = 2 * PI * radius;
		System.out.println("\nThe area of a circle with radius " + radius + " is " + area2);
		System.out.println("The circumference of a circle with radius " + radius + " is " + circ2);
		
		double factArea = area2 / area1;
		double factCirc = circ2 / circ1;
		System.out.println("\nThe area changed by a factor of " + factArea);
		System.out.println("The circumference changed by a factor of " + factCirc);
	}
}