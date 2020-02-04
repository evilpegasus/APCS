//********************************************************************
//  FoodAnalysis.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates indirect referencing through inheritance.
//********************************************************************

public class FoodAnalysis
{
   //-----------------------------------------------------------------
   //  Instantiates a Pizza object and prints its calories per
   //  serving.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Pizza special = new Pizza (275);

      System.out.println ("Calories per serving: " +
                          special.caloriesPerServing());
   }
}
