package labs;
// ****************************************************************
//   LoveCS.java
//
//   Use a while loop to print many messages declaring your 
//   passion for computer science
// ****************************************************************
import java.util.Scanner;

public class LoveCS
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter an int: ");
	int limit = scan.nextInt();

	int count = 1;
	int sum = 0;

	while (count <= limit){
		sum += count;
	    System.out.println(count + " I love Computer Science!!");
		count++;
	}
	System.out.println("Printed " + limit + " times. Sum = " + sum);
    }
}