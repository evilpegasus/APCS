//********************************************************************
//  SortGrades.java       Author: Lewis/Loftus/Cocking
//
//  Driver for testing a numeric selection sort.
//********************************************************************

public class SortGrades
{
   //-----------------------------------------------------------------
   //  Creates an array of grades, sorts them, then prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int[] grades = {89, 94, 69, 80, 97, 85, 73, 91, 77, 85, 93};

      Sorts.selectionSort (grades);

      for (int grade : grades)
         System.out.print (grade + "   ");
   }
}
