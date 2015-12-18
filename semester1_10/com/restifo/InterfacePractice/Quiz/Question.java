package com.restifo.InterfacePractice.Quiz;

public class Question implements Complexity {
	private String question, answer;
	private int complexityLevel;
	
	public Question(String query, String result)
	{
		question = query;
		answer = result;
		complexityLevel = 1;
	}
	
	public void setComplexity(int level) { complexityLevel = level; }
	public int getComplexity() { return complexityLevel; }
	public String getQuestion() { return question; }
	public String getAnswer() { return answer; } 
	public boolean answerCorrect(String cAnswer) { return answer.equals(cAnswer); }
	public String toString() { return question + "\n"; }
}
