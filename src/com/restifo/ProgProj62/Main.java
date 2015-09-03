// Remove this line below this one when grading to make it work
package com.restifo.ProgProj62;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		int[] nums = new int[51];
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			out.print("Enter a number -25-25 (a number outside the range exits): ");
			int num = scan.nextInt();
			if (num >= -25 && num <= 25)
			{
				nums[num]++;
			}
			else
			{
				break;
			}
		}
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] == 0)
			{
				continue;
			}
			out.printf("%d: %d\n", i, nums[i]);
		}
		scan.close();
	}
}
