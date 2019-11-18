
package labs;
// ************************************************
//   BaseConvert.java
//
//   Converts base 10 numbers to another base
//   (at most 4 digits in the other base).  The
//   base 10 number and the base are input.
// ************************************************

import java.util.Scanner;

public class BaseConvert
{
   public static void main (String[] args)
   {
      int base;        // the new base
      int base10Num;   // the number in base 10
      int maxNumber;   // the maximum number that will fit
                       // in 4 digits in the new base

      int place0;      // digit in the 1's (base^0) place
      int place1;      // digit in the base^1 place
      int place2;      // digit in the base^2 place
      int place3;      // digit in the base^3 place

      String baseBNum = new String (""); // the number in the new base
      Scanner scan = new Scanner(System.in);

      // read in the base 10 number and the base
      System.out.println();
      System.out.println ("Base Conversion Program");
      System.out.println();
      System.out.print ("Please enter a base (2 - 9): ");
      base = scan.nextInt();

      // Compute the maximum base 10 number that will fit in 4 digits 
      // in the new base and tell the user what range the number they
      // want to convert must be in

      System.out.print ("Please enter a base 10 number to convert: ");
      base10Num = scan.nextInt();
    

      // Do the conversion (see notes in lab)
      maxNumber = (int) Math.pow(base, 4);
      if (base10Num >= maxNumber) {
    	  System.out.println("Number too large");
      } else {
    	  place3 = (int) (base10Num / Math.pow(base, 3));
    	  base10Num = (int) (base10Num % Math.pow(base, 3));
    	  
    	  place2 = (int) (base10Num / Math.pow(base, 2));
    	  base10Num = (int) (base10Num % Math.pow(base, 2));
    	  
    	  place1 = (int) (base10Num / Math.pow(base, 1));
    	  base10Num = (int) (base10Num % Math.pow(base, 1));
    	  
    	  place0 = base10Num;
    	  
    	  System.out.println(place3 +""+ place2 +""+ place1 +""+ place0);
      }

      // Print the result (see notes in lab)

    }
}