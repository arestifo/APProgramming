package com.restifo.StringMutationPractice;
import static java.lang.System.out;
public class StringMutation {
	public static void main(String[] args)
	{
		String meme = "I'm making a list of the things I must say for politeness";
		meme += " because I'm a savage";
		out.println(meme);
		
		meme = meme.toLowerCase();
		out.println(meme);
		
		meme = meme.toUpperCase();
		out.println(meme);
		
		meme = meme.replace('E', '3');
		out.println(meme);
		
		meme = meme.substring(0, 20);
		out.println(meme);
		
		meme = meme.concat(" DANK");
		out.println(meme);
		
		meme = meme.replace('A', '4');
		out.println(meme);
		
		meme = meme.toLowerCase();
		out.println(meme);
		
		meme = meme.concat(" of super xDDDDDD dank reddit lels");
		out.println(meme);
		
		meme = meme.toUpperCase();
		out.println(meme);
	}
}
