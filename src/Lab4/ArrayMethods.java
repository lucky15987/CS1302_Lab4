/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab4
 * Instructor: Monisha Verma
 */
package Lab4;

import java.util.ArrayList;

public class ArrayMethods 
{
	//ArrayList Object
	ArrayList<Number> list = new ArrayList<>();
	
	//methods shuffle and sort
	public static void shuffle(ArrayList<Number> list)
	{
		java.util.Collections.shuffle(list);
	}
	
	public static void sort(ArrayList<Number> list)
	{
		
		 //java.util.collections.sort does not work on Numbers only Integers
		 
		for (int i = 0; i < list.size() - 1; i++)
		{
			//compares indexes to find the min
			Number min = list.get(i);
			int counter = i;
			
			for (int j = i + 1; j < list.size(); j++)
			{
				if (min.doubleValue() > list.get(j).doubleValue())
				{
					min = list.get(j);
					counter = j;
				}
			}
			
			//Swaps current index with lowest index 
			if (counter != i)
			{
				list.set(counter, list.get(i));
				list.set(i, min);
			} 
		}
		
				
		//java.util.Arrays.sort(list); <---[Does not work]
	}
	
}
