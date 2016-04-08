package com.restifo.OldMacDonald;
public class Chicken implements Animal
{
	private String myType;
    private String mySound;
    private String mySound2;

    Chicken(String type, String sound, String sound2)
    {
        myType = type;
        mySound = sound;
        mySound2 = sound2;
    }

    public String getSound() { return Math.random() > 0.5 ? mySound : mySound2; }
    public String getType() { return myType; }
}