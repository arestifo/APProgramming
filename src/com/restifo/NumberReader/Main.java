package com.restifo.NumberReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.out;
public class Main {

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner lineScan = new Scanner(new File("numbers.txt"));
		int lineCount = 0;
		while (lineScan.hasNext())
		{
			lineScan.next();
			lineCount++;
		}
		lineScan.close();
		Scanner scan = new Scanner(new File("numbers.txt"));
		int[] numbers = new int[101];
		int[] all = new int[lineCount];
		int average = 0;
		int count = 0;
		for (int i = 0; scan.hasNext(); i++)
		{
			int num = Integer.parseInt(scan.next());
			all[i] = num;
			average += num;
			count++;
			numbers[num]++;
		}
	}
}
