package com.restifo.Slots;
import static java.lang.System.out;

import java.util.Scanner;
public class Slots {
	private final static String CLEAR = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner scan = new Scanner(System.in);
		String answer = "";
		do 
		{
			out.print("Do you want to play slots (y/n)? ");
			answer = scan.nextLine();
		} while (!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")));
		
		if (answer.equalsIgnoreCase("y"))
		{
			while (true)
			{
				int[] finNums = new int[3];
				int[][] showNums = new int[3][3];
				for (int i = 0; i < finNums.length; i++)
				{
					finNums[i] = (int)(Math.random() * 10);
				}
				for (int i = 0; i < 10; i++)
				{
					for (int x = 0; x < showNums.length; x++)
						for (int y = 0; y < showNums[x].length; y++)
							showNums[x][y] = (int)(Math.random() * 10);
					
					out.println("/-----SLOTS-----\\");
					out.printf("|   %d   %d   %d   |\n", showNums[0][0], showNums[0][1], showNums[0][2]);
					out.printf("|   %d   %d   %d   |\n", showNums[1][0], showNums[1][1], showNums[1][2]);
					out.printf("|   %d   %d   %d   |\n", showNums[2][0], showNums[2][1], showNums[2][2]);
					out.println("\\---------------/");
					Thread.sleep(200);
					out.println(CLEAR);
				}
				out.println("/-----SLOTS-----\\");
				out.printf("|   %d   %d   %d   |\n", showNums[2][1], showNums[1][2], showNums[0][2]); // Random numbers from random array, doesn't matter
				out.printf("|   %d   %d   %d   |\n", finNums[0], finNums[1], finNums[2]);
				out.printf("|   %d   %d   %d   |\n", showNums[0][1], showNums[2][0], showNums[2][2]);
				out.println("\\---------------/");
				if (finNums[0] == finNums[1] && (finNums[1] == finNums[2]))
				{
					out.println("WINNER! All three numbers are the same!");
				}
				else if (finNums[0] == finNums[1] || finNums[1] == finNums[2] || finNums[0] == finNums[2])
				{
					out.println("Two of the numbers are the same!");
				}
				answer = "";
				do
				{
					out.print("Do you want to keep playing (y/n)? ");
					answer = scan.nextLine();
				} while (!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")));
				if (answer.equalsIgnoreCase("n"))
				{
					break;
				}
			}
		}
		out.println("Bye!");
		scan.close();
	}
}
