package com.restifo.TowersOfHanoi;
//********************************************************************
//  MazeSearch.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates recursion.
//********************************************************************
public class MazeSearch3D
{
   //-----------------------------------------------------------------
   //  Creates a new maze, prints its original form, tries to
   //  solve it, and prints out its final form.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
		  boolean done = false;
		  long millis = System.currentTimeMillis();
		  int count = 0;
		  while (!done)
		  {
		
		      Maze3D labyrinth = new Maze3D();
		   
		      System.out.println (labyrinth);

		      if (labyrinth.traverse (0, 0, 0))
		      {
		    	 done = true;
		         System.out.println ("The maze was successfully solved!");
		      }
		      else
		      {
		         System.out.println ("There is no possible path.");
		      }
		      System.out.println (labyrinth);  
		      count++;
		  }
		  System.out.println("Took " + count + " generations");
	      System.out.println("Took " + (System.currentTimeMillis() - millis) + "ms");
   	}
}