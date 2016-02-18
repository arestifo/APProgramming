package com.restifo.GameOfLife;

import javax.swing.JFrame;

public class Runner {

	public static void main(String[] args) throws InterruptedException 
	{
		JFrame frame = new JFrame("Game of life");
		GameOfLife game = new GameOfLife(20, 20, 30);
		frame.add(game);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		
		for (;;)
		{
			game.doNextGen();
			game.repaint();
			Thread.sleep(100);
		}
	}
}
