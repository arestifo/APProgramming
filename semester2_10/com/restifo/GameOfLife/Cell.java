package com.restifo.GameOfLife;

import java.awt.Color;
import java.awt.Graphics2D;

public class Cell {
	int x;
	int y;
	int ix;
	int iy;
	int hw;
	GameOfLife game;
	public boolean alive = false;
	public Cell(GameOfLife game, int x, int y, int ix, int iy, int hw) // hw = height & width bc square
	{
		this.game = game;
		this.x = x;
		this.y = y;
		this.ix = ix;
		this.iy = iy;
		this.hw = hw;
	}
	
	public void paint(Graphics2D g)
	{
		//g.setColor(alive ? new Color(Color.HSBtoRGB((float)Math.random(), 1.0f, 1.0f)) : Color.white);
		g.setColor(alive ? Color.blue : Color.white);
		g.fillRect(x, y, hw, hw);
		g.setColor(Color.black);
		//g.setColor(new Color(Color.HSBtoRGB((float)Math.random(), 1.0f, 1.0f)));
		g.drawRect(x, y, hw, hw);
	}
}
