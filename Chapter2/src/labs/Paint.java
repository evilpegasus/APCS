package labs;
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Paint
{
    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        //declare integers length, width, and height;
        //declare double totalSqFt;
        //declare double paintNeeded;
	  //declare and initialize Scanner object
        int length, width, height;
        double totalSqFt;
        double paintNeeded;
        Scanner scan = new Scanner(System.in);

        //Prompt for and read in the length of the room
        System.out.print("Length: ");
        length = scan.nextInt();

        //Prompt for and read in the width of the room
        System.out.print("Width: ");
        width = scan.nextInt();

        //Prompt for and read in the height of the room
        System.out.print("Height: ");
        height = scan.nextInt();

        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        totalSqFt = (double)(length * height * 2 + width * height * 2);

        //Compute the amount of paint needed
        paintNeeded = totalSqFt / COVERAGE;

        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Paint Needed: " + paintNeeded + " gal");
    }
}