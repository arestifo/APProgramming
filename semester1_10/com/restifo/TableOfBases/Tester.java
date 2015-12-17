package com.restifo.TableOfBases;
import static java.lang.System.out;
import static java.lang.System.err;
public class Tester {

	public static void main(String[] args) 
	{
		err.printf("Decimal\t\tBinary\t\tOctal\t\tHex\t\tCharacter\n");
		for (int i = 65; i < 91; i++)
			out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", i, toBase(i, 2), toBase(i, 8), toBase(i, 16), (char) i);
	}
	
	private static String toBase(int number, int base)
	{
		return Integer.toString(number, base);
	}
}
