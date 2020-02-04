//********************************************************************
//  Words.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an inherited method.
//********************************************************************

public class Words
{
   //-----------------------------------------------------------------
   //  Instantiates a derived class and invokes its inherited and
   //  local methods.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Dictionary webster = new Dictionary ();

      webster.pageMessage();
      webster.definitionMessage();   
   }
}
