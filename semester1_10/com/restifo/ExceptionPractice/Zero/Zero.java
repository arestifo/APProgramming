package com.restifo.ExceptionPractice.Zero;

public class Zero {

	public static void main(String[] args)
	{
		divide(10, 0);
		System.out.println("This text will not be printed.");
	}
	
	public static void divide(int one, int two)
	{
		System.out.println(one/two);
		System.out.println("This text will not be printed.");
	}
}
