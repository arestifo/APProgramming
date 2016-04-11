package com.restifo.SportsStats;

public class PlayerStats {
	private String player;
	private String team;
	public int score = 0;
	public PlayerStats(String player, String team)
	{
		this.player = player;
		this.team = team;
	}
	public String getPlayer() { return player; }
	public String getTeam() { return team; }
	public String toString()
	{
		return "Player: " + player + "\nTeam: " + team;
	}
}
