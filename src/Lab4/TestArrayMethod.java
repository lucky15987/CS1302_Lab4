/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab4
 * Instructor: Monisha Verma
 */
package Lab4;

import java.util.ArrayList;

public class TestArrayMethod 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//ArrayList Object
		ArrayList<Number> list = new ArrayList<>();
		
		//add values
				list.add(3);
				list.add(5);
				list.add(7);
				list.add(1);
				list.add(4);
				list.add(2);
				list.add(6);
				
				//Print Array and shuffle print
				System.out.println("Shuffle ArrayList:");
				System.out.println(list.toString());
				ArrayMethods.shuffle(list);
				System.out.println(list.toString());
				
				//repeat for sort array
				System.out.println("\nSort ArrayList:");
				System.out.println(list.toString());
				ArrayMethods.sort(list);
				System.out.println(list.toString());
	}

}
