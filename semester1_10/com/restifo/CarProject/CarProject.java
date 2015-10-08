package com.restifo.CarProject;
import static java.lang.System.out;

import java.util.Scanner;
public class CarProject {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String make, model, license;
		out.print("Enter the make of your car: ");
		make = scan.nextLine();
		out.print("Enter the model of your car: ");
		model = scan.nextLine();
		out.print("Enter the license plate: ");
		license = scan.nextLine();
		
		int num = license.charAt(0) + license.charAt(1) + license.charAt(2) + Integer.parseInt(license.substring(4));
		char letter = (char) ('A' + (num % 26));		
		String rental = String.valueOf(letter) + num;
		
		out.println("\nMake = " + make);
		out.println("Model = " + model);
		out.printf("%s = %s", license, rental);
	}
}
