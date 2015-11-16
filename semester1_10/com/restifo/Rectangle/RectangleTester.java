package com.restifo.Rectangle;
import static java.lang.System.out;
public class RectangleTester {
	public static void main(String[] args) 
	{
		Rectangle rectA = new Rectangle(-200, -80, 400, 160);
		rectA.draw();
		
		out.println("Perimeter = " + rectA.getPerimeter()); 
		out.println("Area = " + rectA.getArea());
	}
}
