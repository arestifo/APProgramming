package com.restifo.Fibonacci;

public class Fibonacci {
	public static void main(String[] args)
	{
		System.out.println(recFibonacci(8));
		System.out.println(nonRecFibonacci(8));
	}
	
	private static int recFibonacci(int n)
	{
		if (n < 2)
		{
			return 1;
		}
		else
		{
			return recFibonacci(n - 1) + recFibonacci(n - 2);
		}
	}
	
	private static int nonRecFibonacci(int n)
	{
		int[] temp = new int[n]; temp[0] = 1; temp[1] = 1;
		for (int i = 2; i < n; i++)
		{
			temp[i] = temp[i - 1] + temp[i - 2];
		}
		return temp[n - 1] + temp[n - 2];
	}
}
