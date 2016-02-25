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
		String[] params = JOptionPane.showInputDialog("Enter game parameters (height, width, size of cell)").split(",");
		game = new GameOfLife(Integer.parseInt(params[0]), Integer.parseInt(params[1]), Integer.parseInt(params[2]), false);
		registerListeners();
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
	
	private static void registerListeners()
	{
		Action stats = new AbstractAction("stats") 
		{
			private static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent e)
			{
				int[] rowCol = game.getRowColTen();
				JOptionPane.showMessageDialog(null, String.format("Stats\nGeneration: %d\nCells alive: %d\nRow 10: %d\nColumn 10: %d", gen, game.getAlive(), rowCol[0], rowCol[1]));
			}
		};
		KeyStroke keyS = KeyStroke.getKeyStroke("S");
		game.getInputMap().put(keyS, "stats");
		game.getActionMap().put("stats", stats);
	}
}
