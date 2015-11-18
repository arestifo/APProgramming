package com.restifo.Card;


public class Card {

	private String suit;
	private String rank;
	private int pointValue;

	public Card(String cardRank, String cardSuit, int cardPointValue) 
	{
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}
	
	public String suit() { return suit; }

	public String rank() { return rank; }

	public int pointValue() { return pointValue; }

	public boolean matches(Card otherCard) 
	{
		return true;
	}
	
	public String toString()
	{
		return "";
	}
}
