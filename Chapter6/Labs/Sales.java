// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
	int sum;
	int maxSale = 0;
	int minSale = 0;

	Scanner scan = new Scanner(System.in);
	System.out.println("How many salespeople?");
	final int SALESPEOPLE = scan.nextInt();
	int[] sales = new int[SALESPEOPLE];




	for (int i=0; i<sales.length; i++)
	    {
		System.out.print("Enter sales for salesperson " + (i+1) + ": ");
		sales[i] = scan.nextInt();
		//max
		if (i > 0) {
			if(sales[i] > sales[i-1]) {
				maxSale = i;
			}
		}else {
			maxSale = i;
		}

		//min
		if (i > 0) {
			if(sales[i] < sales[i-1]) {
				minSale = i;
			}
		}else {
			minSale = i;
	    }
	    }

	System.out.println("\nSalesperson   Sales");
	System.out.println("--------------------");
	sum = 0;
	for (int i=0; i<sales.length; i++)
	    {
		System.out.println("     " + (i+1) + "         " + sales[i]);
		sum += sales[i];
	    }

	System.out.println("\nTotal sales: " + sum);

	//Average sales:
	System.out.println("Avg sales: " + (double)sum/5);
	//Max sale:
	System.out.println("Max sale: Salesperson" + (maxSale+1) + " with $" + sales[maxSale]);
	System.out.println("Min sale: Salesperson" + (minSale+1) + " with $" + sales[minSale]);


	//user input
	System.out.println("Enter a minimum");
	int input = scan.nextInt();
	
	for(int i = 0; i < sales.length; i++) {
		if (sales[i] >= input) {
			System.out.println((i+1) + ": $" + sales[i]);
		}
	}
    }
}