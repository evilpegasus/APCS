package labs;
import java.util.Scanner;
//**********************************************************
//  Circle.java
//
//  Print the area of a circle with two different radii
//**********************************************************

public class Circle
{
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
     final double PI = 3.14159;
     
     int radius;
     System.out.print("Enter R1: ");
     radius = scan.nextInt();
     double area1 = PI * radius * radius;
     double circ1 = 2 * PI * radius;

     System.out.println("The area of a circle with radius " + radius +
                        " is " + area1);
     System.out.println("The circumference of a circle with radius " + radius +
             " is " + circ1);

     radius = radius *2;
     double area2 = PI * radius * radius;
     double circ2 = 2 * PI * radius;

     System.out.println("The area of a circle with radius " + radius +
                        " is " + area2);
     System.out.println("The circumference of a circle with radius " + radius +
             " is " + circ2);
     double areaFactor = area2 / area1;
     double circFactor = circ2 / circ1;
     System.out.println("Area Factor:  " + areaFactor);
     System.out.println("Circ Factor  " + circFactor);
    }
}