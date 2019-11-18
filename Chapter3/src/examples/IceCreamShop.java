package examples;
//********************************************************************
//  IceCreamShop.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a foreach loop on an enumerated type.
//********************************************************************

public class IceCreamShop
{
   enum Flavor {vanilla, chocolate, strawberry, fudgeRipple, coffee,
                rockyRoad, mintChocolateChip, cookieDough}

   //-----------------------------------------------------------------
   //  Prints the flavors of ice cream available
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      System.out.println ("Welcome to the Ice Cream Shop!");
      System.out.println ();

      System.out.println ("We have the following flavors:");

      for (Flavor f: Flavor.values())
      {
         System.out.println(f);
      }
   }
}
