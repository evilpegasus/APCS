package labs;
// **********************************************************
//   Temps.java
//
//   This program reads in a sequence of hourly temperature 
//   readings (beginning with midnight) and prints the maximum
//   temperature (along with the hour, on a 24-hour clock, it 
//   occurred) and the minimum temperature (along with the hour
//   it occurred).
// **********************************************************

import java.util.Scanner;

public class Temps
{
    //----------------------------------------------------
    //  Reads in a sequence of temperatures and finds the
    //  maximum and minimum read in.
    //----------------------------------------------------
    public static void main (String[] args)
    {
	final int HOURS_PER_DAY = 24;

	int temp;   // a temperature reading
	int max = 0;
	int maxTime = 0;
	int min = Integer.MAX_VALUE;
	int minTime = 0;

	Scanner scan = new Scanner(System.in);

	// print program heading
	System.out.println ();
	System.out.println ("Temperature Readings for 24 Hour Period");
	System.out.println ();

	for (int hour = 0; hour < HOURS_PER_DAY; hour++)
	{
	    System.out.print ("Enter the temperature reading at " + hour +
				" hours: ");
	    temp = scan.nextInt();
	    if (temp > max) {
	    	max = temp;
	    	maxTime = hour;
	    }
	    if (temp < min) {
	    	min = temp;
	    	minTime = hour;
	    }
	}

	// Print the results
	System.out.println("Max temp: " + max + " at hour: " + maxTime);
	System.out.println("Min temp: " + min + " at hour: " + minTime);
	
    }
}