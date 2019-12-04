//********************************************************************
//  References.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates some behaviors of object references.
//********************************************************************

public class References
{
   //-----------------------------------------------------------------
   //  Creates object references to demonstrate some tricky
   //  behaviors.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Num n1 = new Num (56);
      Num n2 = new Num (57);
      Integer i1 = new Integer (23);
      Integer i2 = new Integer (24);

      System.out.println ("n1: " + n1);
      System.out.println ("n2: " + n2);
      System.out.println ("i1: " + i1);
      System.out.println ("i2: " + i2);
      System.out.println ();

	  n1 = n2;
	  i1 = i2;

      System.out.println ("n1: " + n1);
      System.out.println ("n2: " + n2);
      System.out.println ("i1: " + i1);
      System.out.println ("i2: " + i2);
      System.out.println ();

	  n1.setValue(n1.getValue()+1);
	  i1++;

      System.out.println ("n1: " + n1);
      System.out.println ("n2: " + n2);
      System.out.println ("i1: " + i1);
      System.out.println ("i2: " + i2);
      System.out.println ();

   }
}
