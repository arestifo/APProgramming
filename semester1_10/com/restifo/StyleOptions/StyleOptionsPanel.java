package com.restifo.StyleOptions;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StyleOptionsPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel saying;
	private JCheckBox bold, italic;
	public StyleOptionsPanel()
	{
		saying = new JLabel("Say it with style!");
		saying.setFont(new Font("Helvetica", Font.PLAIN, 36));
		
		bold = new JCheckBox("Bold");
		bold.setBackground(Color.cyan);
	}
}