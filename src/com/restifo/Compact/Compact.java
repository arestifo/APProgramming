package com.restifo.Compact;

import java.util.Scanner;
import static java.lang.System.out;
public class Compact {
	public static void main(String[] args)
	{
		// Populate the original array
		int[] nums = new int[100];
		Scanner scan = new Scanner("resources/Compact/compact.txt");
		scan.useDelimiter("  ");
		int aCount = 0;
		while (scan.hasNext())
		{
			nums[aCount] = Integer.parseInt(scan.next())
			aCount++;
		}
		
		// Print array
		out.print("Before: ");
		for (int i : nums)
		{
			out.print(i + ", ");
		}
		
		// Print compacted array out
		out.print("\nAfter: ");
		for (int i : compact(nums))
		{
			out.print(i + ", ");
		}
	}
	
	private static int[] compact(int[] array)
	{
		int[] ret = new int[array.length];
		for (int i = 0, c = 0; i < array.length; i++)
		{
			if (array[i] != 0)
			{
				ret[c] = array[i];
				c++;
			}
		}
		return ret;
	}
}
