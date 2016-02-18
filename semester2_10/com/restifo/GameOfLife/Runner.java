package com.restifo.GameOfLife;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class Runner {
	static GameOfLife game;
	static int gen = 0;
	public static void main(String[] args) throws InterruptedException 
	{
		JFrame frame = new JFrame("Game of life");
		game = new GameOfLife(50, 50, 10);
		registerKeys();
		frame.add(game);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
		frame.setVisible(true);
		for (;;gen++)
		{
			game.doNextGen();
			game.repaint();
			Thread.sleep(50);
		}
	}
	
	private static void registerKeys()
	{
		Action stats = new AbstractAction("stats") 
		{
			private static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, String.format("Stats\nGeneration: %d\nCells alive: %d", gen, game.getAlive()));
			}
		};
		KeyStroke keyS = KeyStroke.getKeyStroke("S");
		game.getInputMap().put(keyS, "stats");
		game.getActionMap().put("stats", stats);
	}
}
