package com.restifo.SportsStats;
//********************************************************************
//  FootballStats.java       Author: Lewis/Loftus/Cocking
//
//  Solution to Programming Project 7.4
//********************************************************************

public class FootballStats extends PlayerStats
{
   protected int yards;

   //-----------------------------------------------------------------
   //  Sets up this football stat object with the specified info.
   //-----------------------------------------------------------------
   public FootballStats (String player, String team)
   {
      super (player, team);
      yards = 0;
   }

   //-----------------------------------------------------------------
   //  Increase the score by 6.
   //-----------------------------------------------------------------
   public void score()
   {
      score += 6;
   }

   //-----------------------------------------------------------------
   //  Update the number of yards gained.
   //-----------------------------------------------------------------
   public void gainYards (int numYards)
   {
      yards += numYards;
   }

   //-----------------------------------------------------------------
   //  Returns the current number of yards.
   //-----------------------------------------------------------------
   public int getYards()
   {
      return yards;
   }

   //-----------------------------------------------------------------
   //  Returns a description of this stats object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = super.toString();
      result += "\nScore: " + score;
      result += "\nYards: " + yards;
      return result;
   }
}
