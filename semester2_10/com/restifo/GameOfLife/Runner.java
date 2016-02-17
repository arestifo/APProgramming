package com.restifo.GameOfLife;

import javax.swing.JFrame;

public class Runner {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Game of life");
		GameOfLife game = new GameOfLife();
		frame.add(game);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		
		while (true) // game loop
		{
			game.repaint();
		}
	}
}
