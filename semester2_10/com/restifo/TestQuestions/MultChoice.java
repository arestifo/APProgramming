package com.restifo.TestQuestions;
public class MultChoice extends TestQuestion {
	String[] Answer;
	String Question;
	public MultChoice(String[] data)
	{
		
		readQuestion(data);
		
	}
	protected void readQuestion(String[] data)
	{
		Answer = new String[data.length-1];
		Question = data[0];
		for(int i =1; i < data.length; i ++){
			Answer[i-1] = data[i];
		}
	}
	public String toString(){
		String pain = "";
		pain+=question + "\n";
		for(int i =0; i<Answer.length;i++){
			pain+=(char)('A' + i) + ")" + Answer[i] + "\n";
		}
		return pain;
	}
}