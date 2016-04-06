package com.restifo.TestQuestions;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.Callable;
@SuppressWarnings("serial")
public class WriteTest {
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(new File("resources/TestQuestions/testbank.txt"));
		int numQuestions = Integer.parseInt(scan.nextLine());
		ArrayList<TestQuestion> questions = new ArrayList<TestQuestion>();
		HashMap<String, Callable<String[]>> functions = new HashMap<String, Callable<String[]>>()
		{{
			put("e", new Callable<String[]>(){
				public String[] call() throws Exception
				{
					String[] ret = new String[2];
					for (int i = 0; i < ret.length; i++)
						ret[i] = scan.nextLine();
					return ret;
				}});
			put("m", new Callable<String[]>(){
				public String[] call() throws Exception
				{
					int numChoices = Integer.parseInt(scan.nextLine());
					String[] ret = new String[numChoices + 1];
					for (int i = 0; i < ret.length; i++)
						ret[i] = scan.nextLine();
					return ret;
				}});
		}};
		for (int i = 0; i < numQuestions; i++)
		{
			String input = scan.nextLine();
			String[] result = functions.get(input).call();
			questions.add(input.equals("e") ? new Essay(result) : new MultChoice(result));
		}
		for(int i = 0; i < questions.size(); i++)
		{
			System.out.print(i + 1 + ") ");
			System.out.println(questions.get(i));
		}
		scan.close();
	}
}