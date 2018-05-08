package hw1b;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BetterRectangle(double x, double y, double width, double height) {
		// TODO Auto-generated constructor stub
		this.height = (int) height;
		this.width = (int) width;
		this.x = (int) x;
		this.y = (int) y;
		
	}

	public double getPerimeter() {
		double perimeter = 2*getWidth() + 2*getHeight();
		return perimeter;
	}
	
	public double getArea() {
		double area = width*height;
		return area;
	}

	public double getPerimeter(double h, double w) {
		// TODO Auto-generated method stub
		double perimeter = 2*h + 2*w;
		return perimeter;
	}
}
