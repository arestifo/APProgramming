package com.restifo.Magpie4;
import java.util.Scanner;


/**
 * A program to carry on conversations with a human user.
 * This version: 
 * <ul><li>
 *    Uses advanced search for keywords 
 * </li></ul> 
 *    
 * @author Laurie White
 * @version April 2012
 */
public class Magpie4
{
	String str;
	Scanner scan = new Scanner(System.in);
		/**
		 * Get a default greeting
		 * 
		 * @return a greeting
		 */
		public String getGreeting()
		{
			return "Hello, let's talk.";
		}
	
		/**
		 * Gives a response to a user statement
		 * 
		 * @param statement
		 *            the user statement
		 * @return a response based on the rules given
		 */
		public String getResponse(String statement)
		{
			String response = "";
			if (statement.length() == 0)
			{
				response = "Say something, please.";
			}
			else if (findKeyword(statement, "no") >= 0)
			{
				response = "Why so negative?";
			}
			else if (findKeyword(statement, "mother") >= 0
					|| findKeyword(statement, "father") >= 0
					|| findKeyword(statement, "sister") >= 0
					|| findKeyword(statement, "brother") >= 0)
			{
				response = "Tell me more about your family.";
			}
			else if (findKeyword(statement, "cat") >= 0
					|| findKeyword(statement, "dog") >= 0
					|| findKeyword(statement, "horse") >=0)
			{
				response = "Tell me more about your pets.";
			}
		
			else if ((findKeyword(statement, "mr") >= 0
					|| findKeyword(statement, "dr") >= 0) &&(findKeyword(statement, "teacher") >= 0))
			{
				response = "He sounds like a good teacher.";
			}
			else if ((findKeyword(statement, "mrs") >= 0
					|| findKeyword(statement, "dr") >= 0 || findKeyword(statement, "ms") >= 0 )&&(findKeyword(statement, "teacher") >= 0))
			{
				response = "She sounds like a good teacher.";
			}
			else if ((findKeyword(statement, "I like") >= 0))
			{
				str = statement.substring(6);
				response = "Why do you like " + str;
			}
			else if ((findKeyword(statement, "I want") >= 0))
			{
				str = statement.substring(6);
				response = "Go buy " + str + " at the store";
			}
			else if ((findKeyword(statement, "I ") >= 0&&findKeyword(statement, "you") >= 0))
			{
				str = statement.substring(2);
				str = statement.replace("you","");

				response = "Why do you " + str + " me?";
			}
			else
			{
				response = getRandomResponse();
			}
			return response;
		}
	
		/**
		 * Search for one word in phrase. The search is not case
		 * sensitive. This method will check that the given goal
		 * is not a substring of a longer string (so, for
		 * example, "I know" does not contain "no").
		 *
		 * @param statement
		 *            the string to search
		 * @param goal
		 *            the string to search for
		 * @param startPos
		 *            the character of the string to begin the
		 *            search at
		 * @return the index of the first occurrence of goal in
		 *         statement or -1 if it's not found
		 */
		private int findKeyword(String statement, String goal,
				int startPos)
		{
			String phrase = statement.trim().toLowerCase();
			goal = goal.toLowerCase();
	
			// The only change to incorporate the startPos is in
			// the line below
			int psn = phrase.indexOf(goal, startPos);
	
			// Refinement--make sure the goal isn't part of a
			// word
			while (psn >= 0)
			{
				// Find the string of length 1 before and after
				// the word
				String before = " ", after = " ";
				if (psn > 0)
				{
					before = phrase.substring(psn - 1, psn);
				}
				if (psn + goal.length() < phrase.length())
				{
					after = phrase.substring(
							psn + goal.length(),
							psn + goal.length() + 1);
				}
	
				// If before and after aren't letters, we've
				// found the word
				if (((before.compareTo("a") < 0) || (before
						.compareTo("z") > 0)) // before is not a
												// letter
						&& ((after.compareTo("a") < 0) || (after
								.compareTo("z") > 0)))
				{
					return psn;
				}
	
				// The last position didn't work, so let's find
				// the next, if there is one.
				psn = phrase.indexOf(goal, psn + 1);
	
			}
	
			return -1;
		}
	
		/**
		 * Search for one word in phrase. The search is not case
		 * sensitive. This method will check that the given goal
		 * is not a substring of a longer string (so, for
		 * example, "I know" does not contain "no"). The search
		 * begins at the beginning of the string.
		 * 
		 * @param statement
		 *            the string to search
		 * @param goal
		 *            the string to search for
		 * @return the index of the first occurrence of goal in
		 *         statement or -1 if it's not found
		 */
		private int findKeyword(String statement, String goal)
		{
			return findKeyword(statement, goal, 0);
		}
	
		/**
		 * Pick a default response to use if nothing else fits.
		 * 
		 * @return a non-committal string
		 */
		private String getRandomResponse()
		{
			final int NUMBER_OF_RESPONSES = 4;
			double r = Math.random();
			int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
			String response = "";
	
			if (whichResponse == 0)
			{
				response = "Lmao.";
			}
			else if (whichResponse == 1)
			{
				response = "Savage af.";
			}
			else if (whichResponse == 2)
			{
				response = "Tell me more.";
			}
			else if (whichResponse == 3)
			{
				response = "Nice meme.";
			}
	
			return response;
		}
}

