package com.restifo.RecursiveSorts;
import static java.lang.System.out;
public class RecursiveSorts {
	private static final int[] NUMS = {9, 3, 84, 42, 36, 99, 102, 22, 8, 6, 73, 1};
	public static void main(String[] args) 
	{
		int[] numbers = NUMS;
		out.print("Mergesort: ");
		mergeSort(numbers);
		printList(numbers);
		out.println();
		
		out.print("Quicksort: ");
		numbers = NUMS;
		quickSort(numbers);
		printList(numbers);
	}
	
	private static void printList(int[] numbers)
	{
		for (int i : numbers)
		{
			System.out.print(i + " ");
		}	
	}
	
	public static void mergeSort(int[] numbers)
	{
		doMergeSort(numbers, 0, numbers.length - 1);
	}
	
	private static void doMergeSort(int[] numbers, int start, int end)
	{
		if (start < end)
		{
			int middle = (start + end) / 2;
			doMergeSort(numbers, start, middle);
			doMergeSort(numbers, middle + 1, end);
			merge(numbers, start, middle, end);
		}
	}
	
	private static void merge(int[] numbers, int start, int middle, int end)
	{
		int[] tmp = new int[end - start + 1];
		int index1 = start;
		int index2 = middle + 1;
		int indexTmp = 0;
		
		while (index1 <= middle && index2 <= end)
		{
			if (numbers[index1] < numbers[index2])
			{
				tmp[indexTmp] = numbers[index1];
				index1++;
			}
			else
			{

				tmp[indexTmp] = numbers[index2];
				index2++;
			}
			indexTmp++;
		}
		
		while (index1 <= middle)
		{
			tmp[indexTmp] = numbers[index1];
			index1++;
			indexTmp++;
		}
		while (index2 <= end)
		{
			tmp[indexTmp] = numbers[index2];
			index2++;
			indexTmp++;
		}
		
		for (indexTmp = 0; indexTmp < tmp.length; indexTmp++)
		{
			numbers[start + indexTmp] = tmp[indexTmp];
		}
	}
	
	public static void quickSort(int[] numbers)
	{
		doQuickSort(numbers, 0, numbers.length - 1);
	}
	
	private static void doQuickSort(int[] numbers, int start, int end)
	{
		if (start < end)
		{
			int middle = partition(numbers, start, end);
			doQuickSort(numbers, start, middle);
			doQuickSort(numbers, middle + 1, end);
		}
	}
	
	private static int partition(int[] numbers, int start, int end)
	{
		int pivot = numbers[start];
		int i = start - 1;
		int j = end + 1;
		for (;;)
		{
			i++;
			while (numbers[i] < pivot) i++;
			
			j--;
			while (numbers[j] > pivot) j--;
			if (i < j)
			{
				int tmp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = tmp;
			}
			else
			{
				return j;
			}
		}
	}
}
