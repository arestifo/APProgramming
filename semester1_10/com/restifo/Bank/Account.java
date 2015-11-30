package com.restifo.Bank;
import java.text.NumberFormat;
import static java.lang.System.out;
public class Account
{
   private NumberFormat fmt = NumberFormat.getCurrencyInstance();
   private final double RATE = 0.035;
   private int acctNumber;
   private double balance;
   private String name;
   public Account (int acctNumber, double balance, String name)
   {
	   this.acctNumber = acctNumber;
	   this.balance = balance;
	   this.name = name;
   }

   public double deposit (double amount)
   {
      if (amount < 0)
      {
         out.println();
         out.println("Error: Deposit amount is invalid.");
         out.println(acctNumber + " " + fmt.format(amount));
      }
      else
      {
         balance = balance + amount;
      }
      return balance;
   }

   public double withdraw (double amount, double fee)
   {
      amount += fee;
      if (amount < 0) 
      {
         out.println();
         out.println("Error: Withdraw amount is invalid.");
         out.println("Account: " + acctNumber);
         out.println("Requested: " + fmt.format(amount));
      }
      else
      {
         if (amount > balance)
         {
            out.println();
            out.println("Error: Insufficient funds.");
            out.println("Account: " + acctNumber);
            out.println("Requested: " + fmt.format(amount));
            out.println("Available: " + fmt.format(balance));
         }
         else
         {
            balance = balance - amount;
         }
      }
      return balance;
   }

   public Account moveMoney(double amount, Account account)
   {
	   account.withdraw(amount, 0.0);
	   deposit(amount);
	   return account;
   }
   
   public double addInterest()
   {
      balance += balance * RATE;
      return balance;
   }
   
   public String toString()
   {
      return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
   }
   
   public double getBalance() { return balance; }
   public int getAccountNumber() { return acctNumber; }
}

