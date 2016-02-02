package com.restifo.SearchPractice;
import static java.lang.System.out;
public class FindGrade {
	public static void main(String[] args)
	{
		int[] grades = {60, 68, 70, 72, 73, 77, 85, 86, 89, 93, 95, 98};
		int lookFor = 77;
		int pos = Searches.binarySearch(grades, lookFor);
		if (pos != -1)
		{
			out.printf("The grade %d was found at index %d\n", lookFor, pos);
		}
	}
}
