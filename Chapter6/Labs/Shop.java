// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {

	Item item;
	String itemName;
	double itemPrice;
	int quantity;

 	Scanner scan = new Scanner(System.in);

	String keepShopping = "y";

	do 
	    {
		System.out.print ("Enter the name of the item: "); 
		itemName = scan.nextLine();

		System.out.print ("Enter the unit price: ");
		itemPrice = scan.nextDouble();

		System.out.print ("Enter the quantity: ");
		quantity = scan.nextInt();

		// *** create a new item and add it to the cart
		


		// *** print the contents of the cart object using println


		System.out.print ("Continue shopping (y/n)? ");
		keepShopping = scan.nextLine();
	    }
	while (keepShopping.equals("y"));

    }
}