package com.restifo.Fibonacci;
import static java.lang.System.out;
public class Fibonacci {
	public static void main(String[] args)
	{
		out.println(recFibonacci(8));
		out.println(nonRecFibonacci(8));
	}
	
	private static int recFibonacci(int n)
	{
		if (n < 2)
			return 1;
		else
			return recFibonacci(n - 1) + recFibonacci(n - 2);
	}
	
	private static int nonRecFibonacci(int n)
	{
		int[] temp = new int[n];
		for (int i = 0; i < 2; i++)
			temp[i] = 1;
		for (int i = 2; i < n; i++)
			temp[i] = temp[i - 1] + temp[i - 2];
		return temp[n - 1] + temp[n - 2];
	}
}
