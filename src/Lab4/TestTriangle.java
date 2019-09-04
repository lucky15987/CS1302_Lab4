/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab4
 * Instructor: Monisha Verma
 */
package Lab4;

import java.util.Scanner;

public class TestTriangle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//scanner input 
		Scanner input = new Scanner(System.in);
		
		//Get sides
		System.out.println("Enter Side 1: ");
		double side1 = input.nextDouble();
		
		System.out.println("Enter Side 2: ");
		double side2 = input.nextDouble();
		
		System.out.println("Enter Side 3: ");
		double side3 = input.nextDouble();
		
		System.out.println("What color is it?: ");
		String color = input.next();
		
		System.out.println("Is it filled? (Enter True/False): ");
		boolean filled = input.nextBoolean();
		
		input.close();
		
		//create object
		Triangle t1 = new Triangle(side1, side2, side3, color, filled);
		
		System.out.println(t1.toString());
	}

}
