package examples;

/* Author: 
 * 
 * Program will calculate area of some 2D shapes and volumes of 3D shapes
 * To do this we will use if - else if - else statements
 */

import java.util.Scanner;

public class GeometryCalucator31to34
{
	//static variables allow us to use the same variables through out an entire class
	static Scanner scan = new Scanner(System.in);
	static int choice, areaChoice;
	static double dem1, dem2, dem3, area, volume;
	
	//Main method will be used for a main menu of our program
	public static void main(String[] args)
	{
		
		//using \n to go to the next line and 
		//concatenation to put one print statement on multiple lines
		System.out.println("1. Area of Rectangle\n"
						+  "2. Area of a Triangle\n"
						+  "3. Area of Circle\n"
						+  "4. Volume of a Prism/Cylinder\n"
						+  "5. Volume of a Pyramid/Cone\n\n");
		
		//Don't for get to scan nextLine() to read the enter of the users input
		System.out.print("Please enter the number that corresponds to your chioce: ");
		choice = scan.nextInt(); scan.nextLine();
		
		// if else statement no {} needed if only a single line of code
		// otherwise {} are needed to hold many lines of code like the else
		// choice <=3 is a boolean statement that will result in a true or false value
		if(choice <= 3)
			//calling a method to calculate the area
			shapeArea(choice);
		else
		{
			
				System.out.println("Please enter the base of your Prism/Cylinder or Pyramid/Cone\n"
						+"1.Square\n"
						+  "2. Triangle\n"
						+  "3. Circle\n");
				System.out.print("Please enter the number that corresponds to your chioce: ");
				areaChoice = scan.nextInt(); scan.nextLine();
				//calling a method that will calculate the volume
				shapeVolume(choice, areaChoice);
		}
	}
	
	//Method to calculate area notice it is outside the main method
	public static void shapeArea(int shape)
	{
		if(shape == 1) //Shape is rectangle
		{
			System.out.print("Please enter the side lengths of your Retangle separeted with a space: ");
			dem1 = scan.nextDouble();
			dem2 = scan.nextDouble();
			scan.nextLine();
			//area = length*height
			area = dem1*dem2;
			System.out.println("The area of your Retangle is: "+ area);
		}
		else if(shape != 3) //Shape is triangle, != means not equal could also use shape == 2
		{
			System.out.print("Please enter the width and height of your Triangle separeted with a space: ");
			dem1 = scan.nextDouble();
			dem2 = scan.nextDouble();
			scan.nextLine();
			//area = 1/2*base*height
			area = (double)1/2*dem1*dem2;
			System.out.println("The area of your Triangle is: "+ area);
		}
		else // Shape is cirlce
		{
			System.out.print("Please enter the raidus of your Cirlce: ");
			dem1 = scan.nextDouble();
			scan.nextLine();
			//area = PI*r^2
			area = Math.PI * Math.pow(dem1,2);
			System.out.println("The area of your Circle is: "+ area);
		}
			
	}
	
	//Method to calculate Volume notice it is outside the main method
	public static void shapeVolume(int shape, int baseShape)
	{
		//This calls the area method
		shapeArea(baseShape);
		System.out.print("Please enter the height of your Prism/Cylinder or Pyramid/Cone: ");
		dem3 = scan.nextDouble();
		scan.nextLine();
		// == is like the equal sign in math it compare if two things are equal and returns true or false
		// shape is Prism/Cylinder
		if(shape == 4)
		{
			//volume = baseArea * height
			volume = area * dem3;
			System.out.println("The area of your Prism/Cylinder is : " + volume);
		}
		else // shape is Pyramid/Cone
		{
			//volume = 1/3 * baseArea * height
			volume = (double)1/3*area * dem3;
			System.out.println("The area of your Pyramid/Cone is : " + volume);
		}
	}
}
