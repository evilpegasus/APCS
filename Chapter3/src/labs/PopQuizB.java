package labs;

import java.util.Scanner;

public class PopQuizB
{
    //----------------------------------------------------
    //  Reads in a sequence of temperatures and finds the
    //  maximum and minimum read in.
    //----------------------------------------------------
    public static void main (String[] args)
    {
    	int i = -1;
    	String s;
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Index: ");
    	while(i < 0) {
        	i = scan.nextInt();
    	}
    	
    	System.out.println("String: ");
    	s = scan.next();
    	while(s.length() % i != 0) {
    		System.out.println("String must be divisible by " + i + ", try again: ");
        	s = scan.next();
    	}
    	
    	for(int j = i; j <= s.length(); j += i) {
    		s = s.substring(0, j - 1) + "*" + s.substring(j);
    	}
    	System.out.print("Your new string: " + s);
    }
}