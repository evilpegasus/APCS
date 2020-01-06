//********************************************************************
//  FindGrade.java       Author: Lewis/Loftus/Cocking
//
//  Driver for testing a numeric binary search.
//********************************************************************

public class FindGrade
{
   //-----------------------------------------------------------------
   //  Searches an array for a particular grade.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int[] grades = {60, 68, 70, 72, 73, 77, 85, 86, 89, 93, 95, 98};

      // Search for the grade 77
      int lookFor = 77;
      int pos = Searches.binarySearch (grades, lookFor);

      if (pos != -1)
         System.out.println ("The grade " + lookFor + " was found at "
             + "position " + pos);
      else
         System.out.println ("The grade " + lookFor + " was not found");

      // Search for the grade 94
      lookFor = 94;
      pos = Searches.binarySearch (grades, lookFor);

      if (pos != -1)
         System.out.println ("The grade " + lookFor + " was found at "
             + "position " + pos);
      else
         System.out.println ("The grade " + lookFor + " was not found");
   }
}
