/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab4
 * Instructor: Monisha Verma
 */
package Lab4;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>
{
	//no-arg constructor
	public ComparableCircle()
	{
		
	}
	
	//Constructor for ComparableCircle with radius
	public ComparableCircle(double radius)
	{
		super(radius);
	}
	
	
	
	//compareTo method
	
	public int compareTo(ComparableCircle o)
	{
		if (getArea() > o.getArea())
		{
			return 1;
		}
		else if (getArea() < o.getArea())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	
	//toString for Area
	
	public String toString()
	{
		return super.toString() + "\nArea: " + getArea(); 
	}
}
