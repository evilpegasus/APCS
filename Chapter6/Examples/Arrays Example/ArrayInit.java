//(c) A+ Computer Science
// www.apluscompsci.com

//array instantiation example

import static java.lang.System.*;

public class ArrayInit
{
	public static void main(String args[])
	{
		int[] zero = new int[10];
		out.println(zero[1]);
		out.println("\n\n");


		int[] aplus = {1,2,3,4,5,6,7};
		out.println(aplus[0]);
		out.println(aplus[1]);
		out.println(aplus[2]);
		out.println(aplus[5]);
		out.println("\n\n");

		String[] words = new String[10];
		words[0] = "abc";
		words[4] = "def";

		out.println(words[0]);
		out.println(words[4]);
		out.println(words[1]);


		int size=10;
		int[] intList = new int[size];
		out.println(intList[1]);
		out.println("\n\n");


		int[] numList = null;	//numList has no size - how do you fix this problem?
		out.println(numList[1]);
		
		
		//create an array of double
		//print out the last spot in the array of double
	}
}