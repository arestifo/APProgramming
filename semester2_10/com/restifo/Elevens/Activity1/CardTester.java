package com.restifo.Elevens.Activity1;
import static java.lang.System.out;
public class CardTester {

	public static void main(String[] args) 
	{
		Card one = new Card("Jack", "Diamonds", 10);
		Card two = new Card("Ace", "Spades", 11);
		Card three = new Card("Seven", "Hearts", 7);
		
		out.println(one);
		out.println(two);
		out.println(three);
	}
}
