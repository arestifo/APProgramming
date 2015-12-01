package com.restifo.ParameterPractice;
import static java.lang.System.out;
import com.restifo.Num.Num;
public class ParameterTester {
	public void changeValues (int f1, Num f2, Num f3)
	{
		out.println("Before changing the values:");
		out.println("f1\tf2\tf3");
	    out.println(f1 + "\t" + f2 + "\t" + f3 + "\n");

	    f1 = 999;
	    f2.setValue(888);
	    f3 = new Num(777);
	      
	    out.println("After changing the values:");
	    out.println("f1\tf2\tf3");
	    out.println(f1 + "\t" + f2 + "\t" + f3 + "\n");	      
	}
}
