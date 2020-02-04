//********************************************************************
//  Advice.java       Author: Lewis/Loftus/Cocking
//
//  Represents a piece of advice. Used to demonstrate the use of an
//  overridden method.
//********************************************************************

public class Advice extends Thought
{
   //-----------------------------------------------------------------
   //  Prints a message. This method overrides the parent's version.
   //  It also invokes the parent's version explicitly using super.
   //-----------------------------------------------------------------
   public void message()
   {
      System.out.println ("Warning: Dates in calendar are closer " +
                          "than they appear.");

      System.out.println();

      super.message();
   }
}
