package labs;

import java.util.Scanner;

public class Factorials
{
    public static void main (String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	int n = -1;
    	int x = 1;
    	
    	System.out.println("Enter an int: ");
		n = scan.nextInt();
    	while (n < 0) {
        	System.out.println("Int must be positive, try again: ");
    		n = scan.nextInt();
    	}
    	
    	for(int i = 1; i <= n; i++) {
    		x *= i;
    	}
    	
    	System.out.println("Answer: " + x);
    }
}