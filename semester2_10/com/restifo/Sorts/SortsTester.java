package com.restifo.Sorts;

public class SortsTester {

	public static void main(String[] args) 
	{
		String[][] toSort = {{"programs", "java", "always", "very", "well", "document"}, {"eat", "steaks", "juicy", "huge", "dogs", "big"}};
		String[][] results = {SelectionSort.selectionSort(toSort[0]), BubbleSort.bubbleSort(toSort[1])};
		for (String[] a: results)
		{
			for (String s : a)
			{
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
}
