//********************************************************************
//  Student.java       Author: Lewis/Loftus/Cocking
//
//  Represents a student. Used to demonstrate inheritance.
//********************************************************************

public class Student
{
   private String name;
   private int numCourses;

   //-----------------------------------------------------------------
   //  Sets up a student with the specified name and number of
   //  courses.
   //-----------------------------------------------------------------
   public Student (String studentName, int courses)
   {
      name = studentName;
      numCourses = courses;
   }

   //-----------------------------------------------------------------
   //  Returns information about this student as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "Student name: " + name + "\n";

      result += "Number of courses: " + numCourses;

      return result;
   }
}
