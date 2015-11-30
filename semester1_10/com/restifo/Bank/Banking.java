package com.restifo.Bank;
import static java.lang.System.out;
public class Banking
{
   public static void main (String[] args)
   {
	  Account acct1 = new Account(72354, 102.56, "Ted Murphy");
	  Account acct2 = new Account(69713,40.00, "Anita Gomez");
	  Account acct3 = new Account(93757, 759.32, "Sanchit Reddy");
      acct1.deposit (25.85);
      double gomezBalance = acct2.deposit (500.00);
      out.println ("Gomez balance after deposit: " + gomezBalance);
      out.println ("Gomez balance after withdrawal: " + acct2.withdraw (430.75, 1.50));
      out.printf("Reddy balance before moving funds: %,.2f\n", acct3.getBalance());
      acct3 = acct2.moveMoney(10, acct3);
      out.printf("Reddy balance after moving funds: %,.2f\n", acct3.getBalance());
      acct1.addInterest();
      acct2.addInterest();
      acct3.addInterest();
      out.println();
      out.println(acct1);
      out.println(acct2);
      out.println(acct3);
   }
}

