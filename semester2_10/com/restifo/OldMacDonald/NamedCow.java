package com.restifo.OldMacDonald;
public class NamedCow implements Animal
{
	private String myType;
    private String mySound;
    private String myName;

    NamedCow(String type, String name, String sound)
    {
        myType = type;
        mySound = sound;
        myName = name;
    }

    public String getSound() { return mySound; }
    public String getType() { return myType; }
    public String getName() { return myName; }
}