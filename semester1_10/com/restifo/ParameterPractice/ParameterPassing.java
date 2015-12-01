package com.restifo.ParameterPractice;
import com.restifo.Num.Num;
import static java.lang.System.out;
public class ParameterPassing
{
	public static void main (String[] args)
	{
		ParameterTester tester = new ParameterTester();
	    int a1 = 111;
	    Num a2 = new Num(222);
	    Num a3 = new Num(333);

	    out.println("Before calling changeValues:");
	    out.println("a1\ta2\ta3");
	    out.println(a1 + "\t" + a2 + "\t" + a3 + "\n");

	    tester.changeValues (a1, a2, a3);

	    out.println("After calling changeValues:");
	    out.println("a1\ta2\ta3");
	    out.println(a1 + "\t" + a2 + "\t" + a3 + "\n");
	}
}
