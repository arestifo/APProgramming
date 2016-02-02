package com.restifo.SearchPractice;
public class Sorts
{
   public static void selectionSort (int[] numbers)
   {
      int min, temp, step=0;

      for (int index = 0; index < numbers.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < numbers.length; scan++)
            if (numbers[scan] < numbers[min])
               min = scan;

         // Swap the values
         temp = numbers[min];
         numbers[min] = numbers[index];
         numbers[index] = temp;
         System.out.println();
         System.out.println("Grades at selection sort step " + ++step + ": ");
         for (int i = 0; i < numbers.length-1; i++)
         	System.out.print (numbers[i] + "   ");
         System.out.println();
      }
   }
   
   public static void insertionSort (int[] numbers)
   {
   	  int step = 0;
      for (int index = 1; index < numbers.length; index++)
      {
         int key = numbers[index];
         int position = index;

         while (position > 0 && numbers[position-1] > key)
         {
            numbers[position] = numbers[position-1];
            position--;
         }
            
         numbers[position] = key;
         System.out.println();
         System.out.println("Grades at insertion sort step " + ++step + ": ");
         for (int i = 0; i < numbers.length-1; i++)
         	System.out.print (numbers[i] + "   ");
         System.out.println();
 
      }
   }

   public static void insertionSort (Comparable<Object>[] objects)
   {
      for (int index = 1; index < objects.length; index++)
      {
         Comparable<Object> key = objects[index];
         int position = index;

         // shift larger values to the right
         while (position > 0 && objects[position-1].compareTo(key) > 0)
         {
            objects[position] = objects[position-1];
            position--;
         }
            
         objects[position] = key;
       }
   }
}