package com.restifo.MathFun;
import static java.lang.System.out;
public class MathFun {
	public static void main(String[] args)
	{
		byte one = 2 + 3;
		out.printf("2 + 3 = %d\n", one);
		
		byte two = 17 % 4;
		out.printf("17 %% 4 = %d\n", two);
		
		byte three = 4 + 9;
		out.printf("4 + 9 = %d\n", three);
		
		int hip = 46 / 7;
		out.printf("46 / 7 = %d\n", hip);
		
		int savage = 46 % 7;
		out.printf("46 %% 7 = %d\n", savage);
		
		double lit = 2 * 3.0;
		out.printf("2 * 3.0 = %f\n", lit);
		
		double yeet = (double) 25 / 4;
		out.printf("(double)25 / 4 = %f\n", yeet);
		
		int yungSavage = (int) 7.75 + 2;
		out.printf("(int) 7.75 + 2 = %d\n", yungSavage);
		
		int yungLit = (int) 'P';
		out.printf("(int) 'P' = %d\n", yungLit);
		
		char yungYeet = (char)105;
		out.printf("(char)105 = %c\n\n", yungYeet);
		
		out.println("The maximum value of type byte = " + Byte.MAX_VALUE);
		out.println("The minimum value of type byte = " + Byte.MIN_VALUE);
		out.println("The maximum value of type short = " + Short.MAX_VALUE);
		out.println("The minimum value of type short = " + Short.MIN_VALUE);
		out.println("The maximum value of type int = " + Integer.MAX_VALUE);
		out.println("The minimum value of type int = " + Integer.MIN_VALUE);
		out.println("The maximum value of type long = " + Long.MAX_VALUE);
		out.println("The minimum value of type long = " + Long.MIN_VALUE);
		out.println("The maximum value of type float = " + Float.MAX_VALUE);
		out.println("The minimum value of type float = " + Float.MIN_VALUE);
		out.println("The maximum value of type double = " + Double.MAX_VALUE);
		out.println("The minimum value of type double = " + Double.MIN_VALUE);
		out.println("The maximum value of type char = " + Character.MAX_VALUE);
		out.println("The minimum value of type char = " + Character.MIN_VALUE);
	}
}