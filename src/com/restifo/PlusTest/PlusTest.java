package com.restifo.PlusTest;
// *******************************************************************
//   PlusTest.java
// 
//   Demonstrate the different behaviors of the + operator
// *******************************************************************

public class PlusTest
{
    public static void main (String[] args)
    {
		System.out.println("This is a long string that is the " +
				    "concatenation of two shorter strings.");
	
		System.out.println("The first computer was invented about" + 55 +
				    "years ago.");
	
		System.out.println("8 plus 5 is " + 8 + 5);
	
		System.out.println("8 plus 5 is " + (8 + 5));
	
		System.out.println(8 + 5 + " equals 8 plus 5.");
    }
}
/* Answers to questions:
 * Last three outputs:
 * 1) 8 plus 5 is 85 (java concatenated "8" and "5")
 * 2) 8 plus 5 is 13 (java calculated the value of 8 + 5 and then concatenated it to the string)
 * 3) 13 equals 8 plus 5. (java added the two values since they were before the string)
 * 
 * You could fix the problem by splitting the string using the + operator
 */