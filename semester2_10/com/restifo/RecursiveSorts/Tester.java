package com.restifo.RecursiveSorts;
import static java.lang.System.out;
public class Tester {

	public static void main(String[] args) 
	{
		double[] prices = {9.99, 0.99, 1.49, 4.99, 19.99, 100.49, 80.49, 0.49, 59.99, 39.99};
		RecursiveSorts.quickSort(prices);
		printList(prices);
	}
	
	private static void printList(double[] numbers)
	{
		for (double d : numbers)
		{
			out.printf("%.2f  ", d);
		}
	}
}
