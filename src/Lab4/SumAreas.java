
/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab4
 * Instructor: Monisha Verma
 */
package Lab4;

public class SumAreas 
{
	//data field
	private static double sum = 0;
	
	//method SumArea(GeometricObject []) and getter for sum
	public static double sumArea(GeometricObject [] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i].getArea();
		}
		return sum;
	}
}
