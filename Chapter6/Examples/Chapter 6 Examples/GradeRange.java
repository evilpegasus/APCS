//********************************************************************
//  GradeRange.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an array of String objects.
//********************************************************************

public class GradeRange
{
   //-----------------------------------------------------------------
   //  Stores the possible grades and their numeric lowest value,
   //  then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-",
                         "D+", "D", "D-", "F"};

      int[] cutoff = {95, 90, 87, 83, 80, 77, 73, 70, 67, 63, 60, 0};
      
      for (int level = 0; level < cutoff.length; level++)
         System.out.println (grades[level] + "\t" + cutoff[level]);
   }
}
