// Remove this line below this one when grading to make it work
package com.restifo.ProgProj62;

import static java.lang.System.out;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		int[] nums = new int[51];
		Scanner scan = new Scanner(System.in);
		out.println("To exit, enter a number outside the range");
		while (true)
		{
			out.print("Enter a number -25-25: ");
			int num = scan.nextInt();
			if (num >= -25 && num <= 25)
			{
				nums[num + 25]++;
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
			out.printf("%d: %d\n", i - 25, nums[i]);
		}
		scan.close();
	}
}
