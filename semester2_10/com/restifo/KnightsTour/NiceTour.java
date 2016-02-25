package com.restifo.KnightsTour;
import java.util.Arrays;
public class NiceTour {
	static long millis = System.currentTimeMillis();
	static final int[][] possible = {{-1,2}, {1,2}, {2,1}, {2,-1}, {1,-2}, {-1,-2}, {-2,-1}, {-2,1}};
	final static int size = 1 + 100 * 4;
	static int[][] board = new int[size][size];
	static int[] pos = new int[] {0, 0};
	static int direction = 0;	
	
	public static void main(String[] argz)
	{
		for(int i = 0; i < board.length; i++)
		{
			Arrays.fill(board[i], -1);
		}
		
		int count = 0;
		board[pos[0]][pos[1]] = count;
		while(decideMove() != -1 && hasNegOne())
		{
			count++;
			int a = decideMove();
			if(a != direction * 2 + 1 && a != direction * 2)
			{
				direction++;
				direction %= 4;
			}
			pos[0] += possible[a][0];
			pos[1] += possible[a][1];
			board[pos[0]][pos[1]] = count;
		}
		for(int i = 0; i < board.length; i++)
		{
			System.out.print("\t" + i);
		}
		System.out.print("\n");
		for(int i = 0; i < board.length; i++)
		{
			System.out.print(i + "\t");
			for(int j = 0; j < board[i].length; j++)
			{
				if(board[i][j] == -1)
				{
					System.out.print("\t");
				}
				else
				{
					System.out.print(board[i][j] + "\t");
				}
			}
			System.out.print("\n");
		}
		System.out.println(System.currentTimeMillis() - millis);
	}

	public static boolean hasNegOne()
	{
		for(int i = 0;i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				if(board[i][j] == -1)
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public static int decideMove()
	{
		for(int i = 0; i < possible.length; i++)
		{
			if(possible[(i + direction * 2) % 8][0] + pos[0] >= 0 && possible[(i + direction * 2) % 8][0] + pos[0] < board.length)
			{
				if(possible[(i + direction * 2) % 8][1] + pos[1]>=0 && possible[(i + direction * 2) % 8][1] + pos[1] < board.length)
				{
					if(board[possible[(i + direction * 2) % 8][0] + pos[0]][possible[(i + direction * 2) % 8][1] + pos[1]] == -1)
					{
						return (i + direction * 2) % 8;
					}
				}
			}
		}
		return -1;
	}
}
