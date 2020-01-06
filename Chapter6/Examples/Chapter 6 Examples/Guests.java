//********************************************************************
//  Guests.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates a linear search.
//********************************************************************

import java.util.Scanner;

public class Guests
{
   //-----------------------------------------------------------------
   //  Creates an array of guests' names and allows the user to
   //  search the array for a particular name.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String[] guests = {"Paul", "Wendy", "Jared", "Eric", "Ayame",
                         "Ian", "Isobel", "Hakem"};
      String name;
      boolean found = false;
	  Scanner scan = new Scanner (System.in);

      System.out.print ("Enter a name: ");
      name = scan.nextLine();

      // Perform a linear search
      for (String guest : guests)
         if (name.equals(guest))
            found = true;

      if (found)
         System.out.println (name + " is on the guest list.");
      else
         System.out.println (name + " is not on the guest list.");
   }
}
