package com.restifo.Num;
import static java.lang.System.out;
public class References {
	public static void main(String[] args)
	{
		Num n1 = new Num(56);
		Num n2 = new Num(57);
		Integer i1 = 23;
		Integer i2 = 24;
		
		out.println("n1: " + n1);
		out.println("n2: " + n2);
		out.println("i1: " + i1);
		out.println("i2: " + i2);
		
		n1 = n2;
		i1 = i2;

		out.println("\nn1: " + n1);
		out.println("n2: " + n2);
		out.println("i1: " + i1);
		out.println("i2: " + i2);
		
		n1.setValue(n1.getValue() + 1);

		out.println("\nn1: " + n1);
		out.println("n2: " + n2);
		out.println("i1: " + i1);
		out.println("i2: " + i2);
	}
}
