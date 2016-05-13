package com.restifo.TowersOfHanoi;
public class Maze3D
{
	private final int TRIED = 3;
	private final int PATH = 7;

	private int[][][] grid;
	
	public Maze3D()
	{
		grid = new int[(int) (Math.random() * 3 + 5)][(int) (Math.random() * 3 + 5)][(int) (Math.random() * 3 + 5)];
		for (int x = 0; x < grid.length; x++)
		{
			for (int y = 0; y < grid[0].length; y++)
			{
				for (int z = 0; z < grid[0][0].length; z++)
				{
					grid[x][y][z] = (int) (Math.random() * 2);
				}	
			}	
		}
	}

	public boolean traverse (int row, int column, int depth)
	{
		boolean done = false;
		if (valid (row, column, depth))
		{
			grid[depth][row][column] = TRIED;
			if (depth == grid.length-1 && row == grid[0].length-1 && column == grid[0][0].length-1)
			{
				done = true;
			}
			else
			{
				done = traverse(row+1, column, depth);
				if (!done)
					done = traverse(row, column+1, depth);
				if (!done)
					done = traverse(row-1, column, depth);
				if (!done)
					done = traverse(row, column-1, depth);
				if (!done)
					done = traverse(row, column, depth-1);
				if (!done)
					done = traverse(row, column, depth+1);
			}
			if (done)
			{
				grid[depth][row][column] = PATH;
			}
		}
		System.out.println(this);
		return done;
	}

	private boolean valid (int row, int column, int depth)
	{
		boolean result = false;
		if (depth >= 0 && depth < grid.length && row >= 0 && row < grid[depth].length && column >= 0 && column < grid[depth][row].length)
		{
			if (grid[depth][row][column] == 1)
			{
				result = true;
			}
		}
		return result;
	}

	public String toString ()
	{
		String result = "";
		for (int depth = 0; depth < grid.length; depth++)
		{
			result += "Layer: " + depth + "\n";
			for (int row=0; row < grid[depth].length; row++)
			{
				for (int column=0; column < grid[depth][row].length; column++)
				{
					result += grid[depth][row][column] + "";
				}
				result += "\n";
			}
			result += "\n";
		}
		return result;
	}
}