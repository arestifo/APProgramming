package com.restifo.Fibonacci;
import static java.lang.System.out;

import java.util.concurrent.Callable;
public class Fibonacci {
	public static void main(String[] args) throws Exception
	{
		out.printf("Recursive n=%d: %d\n", 0, rf(0));
		out.printf("Recursive n=%d: %d\n", 3, rf(3));
		out.printf("Recursive n=%d: %d\n\n", 11, rf(11));
		
		out.printf("Non-recursive n=%d: %d\n", 1, nrf(1));
		out.printf("Non-recursive n=%d: %d\n", 5, nrf(5));
		out.printf("Non-recursive n=%d: %d\n\n", 14, nrf(14));
		
		out.printf("Recursive mult a=%d b=%d: %d\n", 0, 4, m(0, 4));
		out.printf("Recursive mult a=%d b=%d: %d\n", 3, 1, m(3, 1));
		out.printf("Recursive mult a=%d b=%d: %d\n", 7, 8, m(7, 8));
		out.printf("Recursive mult a=%d b=%d: %d", 5, 0, m(5, 0));
	}
	
	private static int rf(int n)
	{
		return n < 2 ? n : rf(n - 1) + rf(n - 2);
	}
	
	private static int nrf(int n) throws Exception
	{
		return n > 1 ? n : (int) new Callable<Object>(){public Object call() throws Exception{if(n>1){int[]t=new int[n];t[1]=1;for(int i=2;i<n;i++)t[i]=t[i-1]+t[i-2];return t[n-1]+t[n-2];}else return n;}}.call(); 
	}
	
	private static int m(int a, int b)
	{
		return a == 0 || b == 0 ? 0 : a < 0 || b < 0 ? -a + m(a, b - 1) : a + m(a, b - 1);
	}
}
