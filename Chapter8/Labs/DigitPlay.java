package Chapter8.Labs;

// *******************************************************************
//   DigitPlay.java
// 
//   Finds the number of digits in a positive integer.
// *******************************************************************

import java.util.Scanner;

public class DigitPlay
{

    public static void main (String[] args)
    {
	int num;    //a number
	int idNumber;

	Scanner scan = new Scanner(System.in);

	System.out.println ();
	System.out.print ("Please enter a positive integer: ");
	num = scan.nextInt ();
  
	if (num <= 0)
	    System.out.println ( num + " isn't positive -- start over!!");
	else {
		// Call numDigits to find the number of digits in the number
		// Print the number returned from numDigits
		System.out.println ("\nThe number " + num + " contains " +
				    + numDigits(num) + " digits.");
		System.out.println ("\nThe digits of the number " + num + " sum up to " +
				    + sumDigits(num) + ".");
		System.out.println ();
	}
	System.out.println ();
	System.out.print ("Please enter a positive integer ID Number: ");
	idNumber = scan.nextInt ();

	if (idNumber <= 0)
	    System.out.println ( idNumber + " isn't positive -- start over!!");
	else {
		if(sumDigits(idNumber) % 7 == 0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}
    }

    // -----------------------------------------------------------
    //  Recursively counts the digits in a positive integer 
    // -----------------------------------------------------------
    public static int numDigits(int num)
    {
	if (num < 10)
	    return (1);
	else
	    return (1 + numDigits(num/10));
	}
	
	public static int sumDigits(int num) {
		if (num < 10)
	    return (num);
	else
	    return (sumDigits(num%10) + sumDigits(num/10));
	}
}