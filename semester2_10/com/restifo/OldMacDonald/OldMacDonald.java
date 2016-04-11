package com.restifo.OldMacDonald;
public class OldMacDonald
{
    public static void main(String[] args)
    {
    	Cow c = new Cow("cow", "moo");
    	System.out.println(c.getType() + " goes " + c.getSound());
    	
    	Farm farm = new Farm();
    	farm.animalSounds();
  }
}