package labs;
// ***************************************************************
//   Salary.java
//   Computes the raise and new salary for an employee
// ***************************************************************
import java.util.Scanner;

public class Salary
{
   public static void main (String[] args)
   {
      double currentSalary;  // current annual salary
      String rating;         // performance rating
      double raise = 0;          // dollar amount of the raise

	   Scanner scan = new Scanner(System.in);

      // Get the current salary and performance rating
      System.out.print ("Enter the current salary: ");
      currentSalary = scan.nextDouble();
      System.out.print ("Enter the performance rating (Excellent, Good, Poor): ");
      rating = scan.next();

      // Compute the raise -- Use if ... else ...
      if (rating.equals("Excellent")) {
    	  raise = currentSalary * 0.06;
      } else if (rating.equals("Good")) {
    	  raise = currentSalary * 0.04;
      } else if(rating.equals("Poor")) {
    	  raise = currentSalary * 0.015;
      } else {
    	  System.out.println("You made a typo, please try again...");
    	  System.exit(0);
      }

      // Print the results
      System.out.println ("Amount of your raise: $" + raise);
      System.out.println ("Your new salary: $" + (currentSalary + raise));
   }
}