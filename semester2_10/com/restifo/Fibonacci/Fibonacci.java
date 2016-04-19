package com.restifo.Fibonacci;
import static java.lang.System.out;
public class Fibonacci {
	public static void main(String[] args)
	{
		out.println(rf(8));
		out.println(nrf(8));
	}
	
	// Recursive fibonacci
	private static int rf(int n)
	{
		if (n < 2)
			return n;
		else
			return rf(n - 1) + rf(n - 2);
	}
	
	// Non-recursive fibonacci
	private static int nrf(int n)
	{
		int[] temp = new int[n];
		temp[1] = 1;
		for (int i = 2; i < n; i++)
			temp[i] = temp[i - 1] + temp[i - 2];
		return temp[n - 1] + temp[n - 2];
	}
}
