//********************************************************************
//  StudentAthlete.java       Author: Lewis/Loftus/Cocking
//
//  Represents a student athlete who plays a sports team for the school.
//  Used to demonstrate inheritance.
//********************************************************************

public class StudentAthlete extends Student
{
   private String sport;

   //-----------------------------------------------------------------
   //  Sets up the student athlete using the specified information.
   //-----------------------------------------------------------------
   public StudentAthlete (String studentName, int courses,
                       String sportName)
   {
      super (studentName, courses);

      sport = sportName;
   }

   //-----------------------------------------------------------------
   //  Returns a description of this graduate student as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = super.toString();

      result += "\nSport: " + sport;

      return result;
   }
}
