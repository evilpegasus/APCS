package examples;
//********************************************************************
//  IceCream.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of enumerated types.
//********************************************************************

public class IceCream
{
   enum Flavor {vanilla, chocolate, strawberry, fudgeRipple, coffee,
                rockyRoad, mintChocolateChip, cookieDough}

   //-----------------------------------------------------------------
   //  Creates and uses variables of the Flavor type.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Flavor cone1, cone2, cone3;

      cone1 = Flavor.rockyRoad;
      cone2 = Flavor.chocolate;

      System.out.println ("cone1 : " + cone1);
      System.out.println ("cone2 : " + cone2);

      cone3 = cone1;

      System.out.println ("cone3 : " + cone3);
   }
}
