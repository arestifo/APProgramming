package com.restifo.GameOfLife;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class GameOfLife extends JPanel {
	private static final long serialVersionUID = 1L;
	Cell[][] cells = new Cell[20][20];

	public GameOfLife()
	{
		initCells();
	}
	
	private void initCells()
	{
		int tHw = 30;
		int tX = 0;
		int tY = 0;
		boolean alive = false;
		for (int x = 0; x < 20; x++)
		{
			for (int y = 0; y < 20; y++)
			{
				cells[x][y] = new Cell(this, tX, tY, tHw);
				cells[x][y].setAlive(alive);
				alive = !alive;
				tX += 30;
			}
			tX = 0;
			tY += 30;
		}
	}
	
	@Override
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		for (Cell[] cc : cells)
		{
			for (Cell c : cc)
			{
				c.paint(g2d);
			}
		}
	}
}
