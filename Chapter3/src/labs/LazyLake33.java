package labs;

import java.util.Scanner;

public class LazyLake33
{
    //----------------------------------------------------
    //  Reads in a sequence of temperatures and finds the
    //  maximum and minimum read in.
    //----------------------------------------------------
    public static void main (String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter temp: ");
    	double temp = scan.nextDouble();
    	
    	if (temp < 40) {
    		System.out.println("skiing");
    	} else if (temp < 60) {
    		System.out.println("golf");
    	} else if (temp < 80) {
    		System.out.println("tennis");
    	} else {
    		System.out.println("swimming");
    	}
    	if (temp > 95 || temp < 20) {
    		System.out.println("Visit our shops!");
    	}
    }
}