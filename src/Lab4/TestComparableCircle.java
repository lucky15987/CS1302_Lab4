/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab4
 * Instructor: Monisha Verma
 */
package Lab4;

public class TestComparableCircle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Two circle objects to compare
		ComparableCircle c1 = new ComparableCircle(1);
		ComparableCircle c2 = new ComparableCircle(2);
		
		//Print out results
		System.out.println("\nComparable Circle 1: " + c1);
		System.out.println("\nComparable Circle 2: " + c2);
		
		//compares the objects
		System.out.print("\nIs Circle 1 larger than Circle 2?: ");
		System.out.println(c1.compareTo(c2) == 1);

	}

}
