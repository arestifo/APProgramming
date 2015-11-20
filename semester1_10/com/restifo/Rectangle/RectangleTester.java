package com.restifo.Rectangle;
public class RectangleTester {
	public static void main(String[] args) 
	{
		Rectangle rectA = new Rectangle(190, 190, 190, 190);
		rectA.draw();

		Rectangle rectB = new Rectangle(190, 60, 190, 60);
		rectB.draw();
		
		Rectangle rectC = new Rectangle(60, 190, 60, 190);
		rectC.draw();
	}
}
