package com.restifo.FileNerd;
import static java.lang.System.out;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileNerd {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner fileScan = new Scanner(new File("resources/FileNerd/NerdData.txt"));
		while (fileScan.hasNext())
		{
			String line = fileScan.nextLine();
			if (line.startsWith("The"))
			{
				out.println(line);
			}
		}
		fileScan.close();
	}
}
