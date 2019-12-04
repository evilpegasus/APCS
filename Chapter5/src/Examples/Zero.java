//********************************************************************
//  Zero.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates an uncaught exception.
//********************************************************************

public class Zero
{
   //-----------------------------------------------------------------
   //  Calls a method that will produce an exception.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      divide(10, 0);

      System.out.println ("This text will not be printed.");
   }

   //-----------------------------------------------------------------
   //  Deliberately divides by zero to produce an exception.
   //-----------------------------------------------------------------
   public static void divide(int numerator, int denominator)
   {
      System.out.println (numerator / denominator);

      System.out.println ("This text will not be printed.");
   }
}
