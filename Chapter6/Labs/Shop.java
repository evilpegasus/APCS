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
	ArrayList<Item> cart = new ArrayList<Item>();

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
		item = new Item(itemName, itemPrice, quantity);
		cart.add(item);

		// *** print the contents of the cart object using println
		//System.out.println(cart.toString());
		double totalPrice = 0;
		System.out.println("Name\tUnit Price\tQuantity\tTotal Price");
		for (int i = 0; i < cart.size(); i++) {
			System.out.println(cart.get(i).getName() + "\t" + cart.get(i).getPrice() + "\t\t" + cart.get(i).getQuantity() + "\t\t" + cart.get(i).getQuantity()*cart.get(i).getPrice());
			totalPrice += cart.get(i).getQuantity()*cart.get(i).getPrice();
		}
		System.out.println("Total Price " + totalPrice);
		



		System.out.print ("Continue shopping (y/n)? ");
		scan.nextLine();
		keepShopping = scan.nextLine();
	    }
	while (keepShopping.equalsIgnoreCase("y"));

    }
}