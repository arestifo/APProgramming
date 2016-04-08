package com.restifo.TestQuestions;

public class MultChoice extends TestQuestion {
	String[] answer;
	String question;
	public MultChoice(String[] data)
	{
		readQuestion(data);
	}
	protected void readQuestion(String[] data)
	{
		answer = new String[data.length - 1];
		question = data[0];
		for(int i = 1; i < data.length; i++)
		{
			answer[i - 1] = data[i];
		}
	}
	public String toString()
	{
		String pain = "";
		pain += question + "\n";
		for(int i = 0; i < answer.length; i++)
		{
			pain += (char)('A' + i) + ")" + answer[i] + "\n";
		}
		return pain;
	}
}