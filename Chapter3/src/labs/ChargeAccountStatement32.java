package labs;

import java.util.*;
import java.text.*;


public class ChargeAccountStatement32
{
	public static void main (String[] args)
	   {
	      Scanner scan = new Scanner(System.in);
	      DecimalFormat fmt = new DecimalFormat("0.00");
	      NumberFormat num = NumberFormat.getCurrencyInstance();

	      //new bal
	      System.out.println("Enter previous balance: ");
	      double prevBal = scan.nextDouble();
	      
	      System.out.println("Enter new charges: ");
	      double newCharge = scan.nextDouble();
	      
	      double minPay;
	      if (prevBal < 50) {
	    	  minPay = newCharge;
	      } else if (prevBal <= 300) {
	    	  minPay = 50;
	      } else {
	    	  minPay = 0.2 * newCharge;
	      }
	      
	      double interest;
	      //Interest
	      if (prevBal == 0) {
	    	  interest = 0;
	      } else {
	    	  interest = 0.02 * (newCharge + prevBal);
	      }
	      
	      double newBal = newCharge + prevBal;
	      
	      System.out.println("CS CARD STATEMENT");
	      System.out.println("=================");
	      System.out.println();
	      System.out.println("Previous Balance:\t" + num.format(prevBal));
	      System.out.println("Additional Charges:\t" + num.format(newCharge));
	      System.out.println("Interest:\t" + num.format(interest));
	      System.out.println();
	      System.out.println("New Balance:\t" + num.format(newBal));
	      System.out.println();
	      System.out.println("Minimum Payment:\t" + num.format(minPay));





	   }
}