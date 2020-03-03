package Labs;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner1
{
	public static void main( String args[] )
	{
		Scanner scan = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Size 1?");
		int size1 = scan.nextInt();
		System.out.println("Name 1?");
		String name1 = scan.nextLine();	//There's a line break issue that's skipping the input for name but the rest works fine
		//instantiate monster one
		Skeleton s1 = new Skeleton(size1, name1);
		//ask for name and size
		System.out.println("Size 2?");
		int size2 = scan.nextInt();
		System.out.println("Name 2?");
		String name2 = scan.nextLine();
		//instantiate monster two
		Skeleton s2 = new Skeleton(size2, name2);

		System.out.println(s1);
		System.out.println(s2);

		String compareSize;
		if (s1.isBigger(s2)) {
			compareSize = "larger than ";
		} else if (!s1.isBigger(s2)) {
			compareSize = "smaller than ";
		} else {
			compareSize = "the same size as ";
		}
		System.out.println("Monster 1 is " + compareSize + "monster 2.");

		if (s1.namesTheSame(s2)) {
			System.out.println("They have the same names.");
		} else {
			System.out.println("They do not have the same names.");
		}
	}
}