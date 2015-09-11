package com.restifo.Compact;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.out;
public class Compact {
	public static void main(String[] args) throws FileNotFoundException
	{
		int[] nums = new int[20];
		Scanner scan = new Scanner(new File("resources/Compact/compact.txt"));
		scan.useDelimiter("  ");
		int count = 0;
		while (scan.hasNext())
		{
			nums[count] = Integer.parseInt(scan.next());
			count++;
		}
		out.print("Before: ");
		for (int i : nums)
		{
			out.print(i + ", ");
		}
		compact(nums);
		scan.close();
	}
	
	private static void compact(int[] arr)
	{
		out.print("\nAfter: ");
		for (int i : arr)
		{
			if (i != 0)
			{
				out.print(i + ", ");
			}
		}
	}
}
