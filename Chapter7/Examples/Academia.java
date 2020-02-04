//********************************************************************
//  Academia.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of methods inherited from the Object class.
//********************************************************************

public class Academia
{
   //-----------------------------------------------------------------
   //  Creates objects of two student types, prints some information
   //  about them, then checks them for equality.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Student Frank = new Student ("Frank", 5);
      StudentAthlete Suki = new StudentAthlete ("Suki", 4, "Soccer");

      System.out.println (Frank);
      System.out.println ();

      System.out.println (Suki);
      System.out.println ();

      if (! Frank.equals(Suki))
         System.out.println ("These are two different students.");
   }
}
