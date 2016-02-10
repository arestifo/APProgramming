package com.restifo.Sorts;

public class BubbleSort {
	public static String[] bubbleSort(String[] arr)
	{
		boolean loop;
		do
		{
			loop = false;
			for (int j = 0; j < arr.length - 1; j++)
			{
				if (arr[j].compareTo(arr[j + 1]) > 0)
				{
					String t = arr[j]; //temp value to swap the values
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
					loop = true;
				}
			}
		} while (loop);
		return arr;
	}
}
