package com.restifo.GameOfLife;

import java.awt.Color;
import java.awt.Graphics2D;

public class Cell {
	int x;
	int y;
	int hw;
	GameOfLife game;
	public boolean alive = false;
	public Cell(GameOfLife game, int x, int y, int hw) // hw = height & width bc square
	{
		this.game = game;
		this.x = x;
		this.y = y;
		this.hw = hw;
	}
	
	public void paint(Graphics2D g)
	{
		g.setColor(alive ? Color.blue : Color.white);
		g.fillRect(x, y, hw, hw);
		g.setColor(Color.black);
		g.drawRect(x, y, hw, hw);
	}
}
