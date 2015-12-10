package com.restifo.FileTester;
import static java.lang.System.out;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileTester {
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner sf = new Scanner(new File("resources/FileTester/MyData.in"));
		while (sf.hasNext())
		{
			out.println(sf.nextLine());
		}
		sf.close();
	}
}