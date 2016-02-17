package com.restifo.GameOfLife;

import java.awt.Color;
import java.awt.Graphics2D;

public class Cell {
	int x;
	int y;
	int hw;
	GameOfLife game;
	boolean alive = false;
	public Cell(GameOfLife game, int x, int y, int hw) // hw = height & width bc square
	{
		this.game = game;
		this.x = x;
		this.y = y;
		this.hw = hw;
	}
	
	public void paint(Graphics2D g)
	{
		g.setColor(alive ? Color.cyan : Color.white);
		g.fillRect(x, y, hw, hw);
	}
	
	public void setAlive(boolean alive) { this.alive = alive; }
}
