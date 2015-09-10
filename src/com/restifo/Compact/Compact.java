package com.restifo.Compact;

import java.util.Scanner;

public class Compact {
	public static void main(String[] args)
	{
		// Find number of lines
		Scanner lineScan = new Scanner("resources/Compact/compact.txt");
		lineScan.useDelimiter("  ");
		int count = 0;
		while (lineScan.hasNext())
		{
			lineScan.next();
			count++;
		}

	}
}
