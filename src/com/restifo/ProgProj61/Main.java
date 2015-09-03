// Remove this line below this one when grading to make it work
package com.restifo.ProgProj61;

import static java.lang.System.out;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		int[] nums = new int[51];
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			out.print("Enter a number 0-50: ");
			int num = scan.nextInt();
			if (num >= 0 && num <= 50)
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
			out.printf("%d: %d", i, nums[i]);
		}
		scan.close();
	}
}
