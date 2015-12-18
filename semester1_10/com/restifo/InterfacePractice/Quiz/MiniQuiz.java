package com.restifo.InterfacePractice.Quiz;
import java.util.Scanner;
import static java.lang.System.out;
public class MiniQuiz {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String ans;
		Question[] questions = {
				new Question("What is the capital of Jamaica?", "Kingston"),
				new Question("Which is worse, ignorance or apathy?", "I don't know and I don't care")
		}; 
		for (Question q : questions)
		{
			out.println(q.getQuestion());
			out.println("(Level " + q.getComplexity() + ")");
			ans = scan.nextLine();
			out.println((q.answerCorrect(ans)) ? "Correct" : "No, the answer is " + q.getAnswer());
		}
		scan.close();
	}
}
