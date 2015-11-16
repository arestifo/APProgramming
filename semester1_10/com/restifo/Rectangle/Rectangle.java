package com.restifo.Rectangle;

import apcslib.DrawingTool;
import apcslib.SketchPad;

public class Rectangle {
	private double myX;
	private double myY;
	private double myWidth;
	private double myHeight;
	private static DrawingTool pen = new DrawingTool(new SketchPad(500, 500));
	
	public Rectangle() { }
	public Rectangle(double x, double y, double width, double height)
	{
		myX = x;
		myY = y;
		myWidth = width;
		myHeight = height;
	}
	
	public double getPerimeter()
	{
		return myWidth * 2 + myHeight * 2;
	}
	
	public double getArea()
	{
		return myWidth * myHeight;
	}
	
	public void draw()
	{
		
	}
}
