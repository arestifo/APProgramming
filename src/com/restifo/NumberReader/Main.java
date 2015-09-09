package com.restifo.NumberReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.out;
public class Main {

	public static void main(String[] args) throws FileNotFoundException
	{
		// Find line count
		Scanner lineScan = new Scanner(new File("resources/NumberReader/numbers.txt"));
		int lineCount = 0;
		while (lineScan.hasNext())
		{
			lineScan.next();
			lineCount++;
		}
		lineScan.close();
		
		// Gather data
		Scanner scan = new Scanner(new File("resources/NumberReader/numbers.txt"));
		int[] numbers = new int[101];
		int[] all = new int[lineCount];
		double average = 0;
		for (int i = 0; scan.hasNext(); i++)
		{
			int num = Integer.parseInt(scan.next());
			all[i] = num;
			average += num;
			numbers[num]++;
		}
		average /= all.length;
		
		// Find mode
		int mode = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] > mode)
			{
				mode = i;
			}
		}
		
		// Find standard deviation
		int sum = 0;
		for (int i = 0; i < all.length; i++)
		{
			sum += Math.pow(all[i] - average, 2);
		}
		sum /= all.length - 1;
		double finSD = Math.sqrt(sum);
		
		// Output everything
		out.printf("Average: \t\t%,.2f\n", average);
		out.printf("Standard deviation: \t%,.2f\n", finSD);
		out.printf("Mode: \t\t\t%d", mode);
		scan.close();
	}
}
