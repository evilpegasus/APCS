//***********************************************************
// TestAccounts1.java
// A simple program to test the numAccts method of the 
// Account class.  
//***********************************************************
import java.util.Scanner;

public class TestAccounts1
{
    public static void main(String[] args)
    {
	Account testAcct;

	Scanner scan = new Scanner(System.in);

	System.out.println("How many accounts would you like to create?");
	int num = scan.nextInt();

	for (int i=1; i<=num; i++)
	    {
		testAcct = new Account(100, "Name" + i);
		System.out.println("\nCreated account " + testAcct);
		System.out.println("Now there are " + Account.getNumAccounts() + 
				   " accounts");
		}
	System.out.println("Enter name 1: ");
	String name1 = scan.nextLine();
	System.out.println("Enter name 2: ");
	String name2 = scan.nextLine();
	System.out.println("Enter name 3: ");
	String name3 = scan.nextLine();

	Account x = new Account(100, name1);
	Account y = new Account(100, name2);
	Account z = new Account(100, name3);

	x.close();
	System.out.println(y.toString());
	System.out.println(x.toString());
	System.out.println(Account.Consolidate(y, z).toString());
	scan.close();
	}
}