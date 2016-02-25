package com.restifo.GameOfLife;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JPanel;

public class GameOfLife extends JPanel {
	private static final long serialVersionUID = 1L;
	private final int h;
	private final int w;
	private final int cellSize;
	Cell[][] cells;
	Cell[][] nextGen;
	
	public GameOfLife(int h, int w, int cellSize, boolean fromFile)
	{
		this.h = h;
		this.w = w;
		this.cellSize = cellSize;
		cells = new Cell[h][w];
		nextGen = new Cell[h][w];
		setPreferredSize(new Dimension(h * cellSize + 1, w * cellSize + 1));
		initCells();
		readData(fromFile);
	}
	
	private void initCells()
	{
		for (int row = 0; row < h; row++)
		{
			for (int col = 0; col < w; col++)
			{
				cells[row][col] = new Cell(this, col * cellSize, row * cellSize, row, col, cellSize);
			}
		}
	}
	
	public void doNextGen()	
	{
		Cell[][] nextGen = new Cell[h][w];
		for (int row = 0; row < h; row++)
		{
			for (int col = 0; col < w; col++)
			{
				nextGen[row][col] = new Cell(this, col * cellSize, row * cellSize, row, col, cellSize); // memory leak
			}
		}

		for (int row = 0; row < h; row++)
		{
			for (int col = 0; col < w; col++)
			{
				nextGen[row][col] = new Cell(this, col * cellSize, row * cellSize, row, col, cellSize); // memory leak
			}
		}  
		for (int row = 0; row < h; row++)
		{
			for (int col = 0; col < w; col++)
			{
				Cell cell = cells[row][col];
				int neighbors = getNeighbors(cell);
				if (!cell.alive && neighbors == 3)
				{
					nextGen[row][col].alive = true;
				}
				if (cell.alive && (neighbors <= 1 || neighbors >= 4))
				{
					nextGen[row][col].alive = false;
				}
				if (cell.alive && (neighbors == 2 || neighbors == 3))
				{
					nextGen[row][col].alive = true;
				}
			}	
		}
		cells = nextGen;
	}
	
	private int getNeighbors(Cell cell)
	{
		// check all possible neighbors
		int x = cell.ix;
		int y = cell.iy;
		int[][] possible = {{x, y + 1}, {x - 1, y + 1}, {x - 1, y}, {x - 1, y - 1}, {x, y - 1}, {x + 1, y - 1}, {x + 1, y}, {x + 1, y + 1}};
		int neighbors = 0;
		for (int[] pos : possible)
		{
			int nX = pos[0], nY = pos[1]; // neighbor x & y
			if (nX < 0 || nX > cells.length - 1 || nY < 0 || nY > cells.length - 1)
			{
				continue; // not a valid neighbor, so skip it
			}
			else
			{
				if (cells[nX][nY].alive == true)
				{
					neighbors++;
				}
			}
		}
		return neighbors;
	}
	
	private void readData(boolean fromFile)
	{
		if (fromFile)
		{
			try 
			{
				 Scanner scan = new Scanner(new File("resources/GameOfLife/lifeData.txt"));
				 int iters = Integer.parseInt(scan.nextLine());
				 for (int i = 0; i < iters; i++)
				 {
					 String[] line = scan.nextLine().split("    ");
					 int row = Integer.parseInt(line[1]) - 1; // for some reason line[0] is ""
					 int col = Integer.parseInt(line[2]) - 1;
					 cells[row][col].alive = true;
				 }
				 scan.close();
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace(); 
			}
		}
		else
		{
			for (int row = 0; row < h; row++)
			{
				for (int col = 0; col < w; col++)
				{
					cells[row][col].alive = Math.random() > 0.75 ? true : false;
				}
			}
		}
	}
	
	public int getAlive()
	{
		int ret = 0;
		for (int row = 0; row < h; row++)
		{
			for (int col = 0; col < w; col++)
			{
				if (cells[row][col].alive == true)
				{
					ret++;
				}
			}
		}
		return ret;
	}
	
	public int[] getRowColTen() 
	{
		int[] ret = new int[2];
		for (int i = 0, j = 0; i < h && j < w; i++, j++)
		{
			if (cells[i][9].alive)
				ret[0]++;
			if (cells[9][i].alive)
				ret[1]++;
		}
		return ret;
	}
	
	@Override
	public void paint(Graphics gr)
	{
		Graphics2D g = (Graphics2D) gr;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		for (Cell[] cc : cells)
		{
			for (Cell c : cc)
			{
				c.paint(g);
			}
		}
	}
}
