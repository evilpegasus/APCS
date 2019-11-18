package labs;
// FILE:  Trace.java
// PURPOSE:  An exercise in tracing a program and understanding
//           assignment statements and expressions.
import java.util.Scanner;
 public class Trace
    {
       public static void main (String[] args)
       {
          int one, two, three;
          double what;
		 Scanner scan = new Scanner(System.in);

          System.out.print ("Enter two integers: ");
          one = scan.nextInt();
          two = scan.nextInt();
      
          System.out.print("Enter a floating point number: ");
          what = scan.nextDouble();

          three = 4 * one + 5 * two;
          two = 2 * one;
          System.out.println ("one " + two + ":" + three);

          one = 46 / 5 * 2 + 19 % 4;
          three = one + two;
          what = (what + 2.5) / 2;
          System.out.println (what + " is what!");
       }
    }