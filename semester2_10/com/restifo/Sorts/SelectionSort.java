package com.restifo.Sorts;

public class SelectionSort {
	public static String[] selectionSort(String[] arr)
	{
		String min;
		int minIndex;
		for (int i = 0; i < arr.length; i++)
		{
			min = arr[i];
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[j].compareTo(min) < 0) //arr[j] < min
				{
					min = arr[j];
					minIndex = j;
				}
			}
			arr[minIndex] = arr[i]; // swap values
			arr[i] = min;
		}
		return arr;
	}
}
