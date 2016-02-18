package com.restifo.GameOfLife;

import javax.swing.JFrame;

public class Runner {

	public static void main(String[] args) throws InterruptedException 
	{
		JFrame frame = new JFrame("Game of life");
		GameOfLife game = new GameOfLife();
		frame.add(game);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	
		for (int i = 0; i < 5; i++)
		{
			game.doNextGen();
			game.repaint();
		}
//		while (true) // game loop
//		{
//			game.doNextGen();
//			game.repaint();
//		}
	}
}
