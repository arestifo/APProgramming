package com.restifo.GasMileage;

public class Automobile {
	private int mpg;
	private double gallons;
	public Automobile(int mpg)
	{
		this.mpg = mpg;
		this.gallons = 0;
	}
	public void takeTrip(int miles){ gallons -= (miles / (double)mpg); }
	public void fillUp(int gallons) { this.gallons += gallons; }
	public double reportFuel() { return gallons; }
}
