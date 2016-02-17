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
	Cell[][] cells = new Cell[20][20];

	public GameOfLife()
	{
		setPreferredSize(new Dimension(601, 601));
		initCells();
		readData();
	}
	
	private void initCells()
	{
		for (int x = 0; x < 20; x++)
		{
			for (int y = 0; y < 20; y++)
			{
				cells[x][y] = new Cell(this, y * 30, x * 30, 30);
			}
		}
	}
	
	private void readData()
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
