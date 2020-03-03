package Chapter7.Labs;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class MonsterRunner1
{
   public static void main( String args[] )
   {
		Monster1 zero = new Monster1();
		Monster1 one = new Monster1(8);
		Monster1 sue = new Monster1(9, 4);
		Monster1 harry = new Monster1(1, 2, 3);
		out.println("\nzero Monster1 :: " + zero);		
		out.println("\none Monster1 :: " + one);
		out.println("\nsue Monster1 :: " + sue);
		out.println("\nharry Monster1 :: " + harry);

		out.println("\nchanging harry's properties ");				
		harry.setHeight(7);
		harry.setWeight(6);
		harry.setAge(5);
		out.println("\nharry Monster1 :: " + harry);

		out.println("\ncloning harry");	
		sue = (Monster1)harry.clone();
		out.println("\nsue Monster1 :: " + sue);

		Monster1 mOne = new Monster1(33,33,11);
		Monster1 mTwo = new Monster1(55,33,11);

		out.println("\nMonster1 1 :: " + mOne);
		out.println("\nMonster1 2 :: " + mTwo);

		out.print("\nmOne.equals(mTwo) == ");
		out.println(mOne.equals(mTwo));

		out.print("\nmOne.compareTo(mTwo) == ");
		out.println(mOne.compareTo(mTwo));
		out.print("\nmTwo.compareTo(mOne) == ");
		out.println(mTwo.compareTo(mOne));
	}
}