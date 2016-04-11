package com.restifo.SportsStats;
import static java.lang.System.out;
public class StatsTester {
	public static void main(String[] args) 
	{
		BaseballStats player1 = new BaseballStats("Sal Runner", "Phillies");
		player1.score += 1;
		player1.hits += 1;
		out.println(player1.toString());
		out.println();
		
		FootballStats player2 = new FootballStats("Mel Rogers", "Rogers");
		player2.score += 6;
		player2.yards += 15;
		out.println(player2.toString());
	}
}
