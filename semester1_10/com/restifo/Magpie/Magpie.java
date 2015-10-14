package com.restifo.Magpie;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
	/**
	 * Get a default greeting 	
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
		if (statement.trim().length() == 0)
			response = "Say something please.";
		else if (statement.indexOf("no") >= 0)
			response = "Why so negative?";
		else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0 || statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0)
			response = "Tell me more about your family.";
		else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0)
			response = "Tell me more about your pets";
		else if (statement.indexOf("Mr. Nateghi") >= 0)
			response = "He sounds like a good teacher.";
		else if (statement.indexOf("dank memes") >= 0 || statement.indexOf("memes") >= 0 || statement.indexOf("meme") >= 0)
			response = "Hipppppppp";
		else
			response = getRandomResponse();
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Lmao.";
		else if (whichResponse == 1)
			response = "It's lit.";
		else if (whichResponse == 2)
			response = "Can you take a moment to talk about jet fuel?";
		else if (whichResponse == 3)
			response = "You don't say.";
		else if (whichResponse == 4)
			response = "Wanna see my meme collection?";
		else if (whichResponse == 5)
			response = "I'm watching you.";
		
		return response;
	}
}
