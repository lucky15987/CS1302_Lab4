/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab4
 * Instructor: Monisha Verma
 */

package Lab4;

public class Triangle extends GeometricObject
{
	//Data fields
	private double side1;
	private double side2;
	private double side3;
	
	//no-arrg constructor
	public Triangle()
	{
		
	}
	
	//constuctor for triangle
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;	
	}
	
	//constructor for inherited data field
	public Triangle(double side1, double side2, double side3, String color, boolean filled)
	{
		this(side1, side2, side3);
		setColor(color);
		setFilled(filled);
	}
	
	//getters for data fields
	public double getSide1()
	{
		return side1;
	}
	
	public double getSide2()
	{
		return side2;
	}
	
	public double getSide3()
	{
		return side3;
	}
	
	//get area and perimeter
	
	public double getArea()
	{
		double p = (getPerimeter() / 2);
		return (Math.sqrt( (p * (p - side1)) * (p - side2) * (p - side3)));
	}
	
	public double getPerimeter()
	{
		return (side1 + side2 + side3);
	}
	
	public String toString()
	{
		return super.toString() + "\nArea: " + getArea() +
		"\nPerimeter: " + getPerimeter(); 
	}
}
