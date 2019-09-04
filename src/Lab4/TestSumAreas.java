/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab4
 * Instructor: Monisha Verma
 */
package Lab4;

public class TestSumAreas 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//create array for objects Circle and Rectangle
		GeometricObject [] array = {new Circle(1), new Circle(2), new Rectangle(3, 4), new Rectangle(5, 7)};
		
		//Print output
		System.out.println("The total Sum of all areas within Array is: " + SumAreas.sumArea(array));
	}

}
