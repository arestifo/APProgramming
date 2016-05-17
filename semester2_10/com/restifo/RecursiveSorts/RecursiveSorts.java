package com.restifo.RecursiveSorts;
public class RecursiveSorts { 
	
	public static void mergeSort(double[] numbers)
	{
		doMergeSort(numbers, 0, numbers.length - 1);
	}
	
	private static void doMergeSort(double[] numbers, int start, int end)
	{
		if (start < end)
		{
			int middle = (start + end) / 2;
			doMergeSort(numbers, start, middle);
			doMergeSort(numbers, middle + 1, end);
			merge(numbers, start, middle, end);
		}
	}
	
	private static void merge(double[] numbers, int start, int middle, int end)
	{
		double[] tmp = new double[end - start + 1];
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
	
	public static void quickSort(double[] numbers)
	{
		doQuickSort(numbers, 0, numbers.length - 1);
	}
	
	private static void doQuickSort(double[] numbers, int start, int end)
	{
		if (start < end)
		{
			int middle = partition(numbers, start, end);
			doQuickSort(numbers, start, middle);
			doQuickSort(numbers, middle + 1, end);
		}
	}
	
	private static int partition(double[] numbers, int start, int end)
	{
		double pivot = numbers[(start + end) / 2];
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
				double tmp = numbers[i];
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
