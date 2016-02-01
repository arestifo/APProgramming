package com.restifo.Guests;
import static java.lang.System.out;

import java.util.Scanner;
public class Guests {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String[] guests = {"Paul", "Wendy", "Jared", "Eric", "Ayame", "Ian", "Isobel", "Hakem"};
		boolean found = false;
		out.print("Enter a name: ");
		String name = scan.nextLine();
		
		for (String guest : guests)	
			if (name.toLowerCase().equals(guest))
				found = true;
		
		System.out.printf("%s is %son the guest list!", name, found ? "" : "not ");
		scan.close();
	}
}
