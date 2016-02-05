package com.restifo.Sorts;
import static java.lang.System.out;
public class Sorts
{
   public static void selectionSort (int[] numbers)
   {
      int min, temp, step=0;

      for (int index = 0; index < numbers.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < numbers.length; scan++)
            if (numbers[scan] > numbers[min])
               min = scan;

         // Swap the values
         temp = numbers[min];
         numbers[min] = numbers[index];
         numbers[index] = temp;
         out.println();
         out.println("Grades at selection sort step " + ++step + ": ");
         for (int i = 0; i < numbers.length-1; i++)
        	out.print (numbers[i] + "   ");
         out.println();
       }
   }
   
   public static void insertionSort(int[] arr)
   {
   	  int step = 0;
      for (int index = 1; index < arr.length; index++)
      {
         int key = arr[index];
         int position = index;

         while (position > 0 && arr[position-1] < key)
         {
            arr[position] = arr[position-1];
            position--;
         }
            
         arr[position] = key;
         out.println();
         out.println("Grades at insertion sort step " + ++step + ": ");
         for (int i = 0; i < arr.length-1; i++)
         	out.print (arr[i] + "   ");
         out.println();
 
      }
   }

   public static Object[] insertionSortObj(Comparable<Object>[] objects)
   {
      for (int index = 1; index < objects.length; index++)
      {
         Comparable<Object> key = objects[index];
         int position = index;

         // shift larger values to the right
         while (position > 0 && objects[position-1].compareTo(key) < 0)
         {
            objects[position] = objects[position-1];
            position--;
         }
            
         objects[position] = key;
       }
      return objects;
   }
   
   public static int[] bubbleSort(int list[])
	{
		int limit;
		int i;
		boolean swaps;
		swaps = true;
		limit = list.length - 1;
		
		while (limit > 0 && swaps)
		{
			swaps = false;
			for (i = 0; i < limit; i++)
			{
				if (list[i] < list [i + 1])
				{
					int temp;
					temp = list [i];
					list[i] = list [i + 1];
					list [i + 1] = temp;
					swaps = true;
				}
			}
			limit--;
		}
		return list;
	}  
}