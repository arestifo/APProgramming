package com.restifo.Die;
import static java.lang.System.out;
public class SnakeEyes {
   public static void main (String[] args)
   {
      final int ROLLS = 500;
      int snakeEyes = 0;
      int num1;
      int num2;
      Die die1 = new Die();
      Die die2 = new Die(20);
      for (int roll = 1; roll <= ROLLS; roll++)
      {
         num1 = die1.roll();
         num2 = die2.roll();
         if (num1 == 1 && num2 == 1)
            snakeEyes++;
      }
      out.println("Number of rolls: " + ROLLS);
      out.println("Number of snake eyes: " + snakeEyes);
      out.println("Ratio: " + (double)snakeEyes / ROLLS);
   }
}

