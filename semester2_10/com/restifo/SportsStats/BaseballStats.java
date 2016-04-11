package com.restifo.SportsStats;
//********************************************************************
//  BaseballStats.java       Author: Lewis/Loftus/Cocking
//
//  Solution to Programming Project 7.4
//********************************************************************
	
public class BaseballStats extends PlayerStats
{
   protected int hits, errors;

   //-----------------------------------------------------------------
   //  Sets up this baseball stat object with the specified info.
   //-----------------------------------------------------------------
   public BaseballStats (String player, String team)
   {
      super (player, team);
      hits = 0;
      errors = 0;
   }

   //-----------------------------------------------------------------
   //  Increase the score by 1.
   //-----------------------------------------------------------------
   public void score()
   {
      score += 1;
   }

   //-----------------------------------------------------------------
   //  Increment the number of hits.
   //-----------------------------------------------------------------
   public void getHit()
   {
      hits += 1;
   }

   //-----------------------------------------------------------------
   //  Returns the current number of errors.
   //-----------------------------------------------------------------
   public void commitError()
   {
      errors += 1;
   }

   //-----------------------------------------------------------------
   //  Returns the current number of hits.
   //-----------------------------------------------------------------
   public int getHits()
   {
      return hits;
   }

   //-----------------------------------------------------------------
   //  Returns the current number of errors.
   //-----------------------------------------------------------------
   public int getErrors()
   {
      return errors;
   }

   //-----------------------------------------------------------------
   //  Returns a description of this stats object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = super.toString();
      result += "\nScore: " + score;
      result += "\nHits: " + hits;
      result += "\nErrors: " + errors;
      return result;
   }
}
