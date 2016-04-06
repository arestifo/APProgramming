package com.restifo.TestQuestions;
public class Essay extends TestQuestion {
	int lines;
	String question;
	public Essay(String[] data)
	{
		readQuestion(data);
	}
	protected void readQuestion(String[] data) 
	{
		lines = Integer.parseInt(data[0]);
		question = data[1];
	}
	public String toString()
	{
		String pain = "";
		pain += question + "\n";
		for(int i = 0; i < lines; i++)
		{
			pain += "___________________________________\n";
		}
		return pain;
	}
}