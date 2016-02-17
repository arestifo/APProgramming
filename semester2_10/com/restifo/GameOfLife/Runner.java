package com.restifo.GameOfLife;

import javax.swing.JFrame;

public class Runner {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Game of life");
		GameOfLife game = new GameOfLife();
		frame.add(game);
		frame.setTitle("Game of life");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		while (true)
		{
			game.repaint();
		}
	}
}
