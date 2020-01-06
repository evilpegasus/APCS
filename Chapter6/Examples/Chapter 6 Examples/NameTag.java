//********************************************************************
//  NameTag.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of command line arguments.
//********************************************************************

public class NameTag
{
   //-----------------------------------------------------------------
   //  Prints a simple name tag using a greeting and a name that is
   //  specified by the user.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      System.out.println ();
      System.out.println ("     " + args[0]);
      System.out.println ("My name is " + args[1]);
      System.out.println ();
   }
}
