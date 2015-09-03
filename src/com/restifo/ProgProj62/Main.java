// Remove this line below this one when grading to make it work
package com.restifo.ProgProj62;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Map<Integer, Integer> numsEntered = new HashMap<Integer, Integer>();
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			out.print("Enter a number between -25-25: ");
			int num = scan.nextInt();
			if (num >= -25 && num <= 25)
			{
				if (numsEntered.containsKey(num))
				{
					numsEntered.put(num, numsEntered.get(num) + 1);
				}
				else
				{
					numsEntered.put(num, 1);
				}
			}
			else
			{
				break;
			}
		}
		for (Integer i : numsEntered.keySet())
		{
			out.println(i + ": " + numsEntered.get(i));
		}
		scan.close();
	}
}
