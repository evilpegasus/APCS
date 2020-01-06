//(c) A+ Computer Science
// www.apluscompsci.com

//Array instance variable example two

import java.util.Scanner;
import static java.lang.System.*;

public class ArrayIVarsTwo
{
	private int[] nums;

   public ArrayIVarsTwo(String list)
   {
   	//instantiate the array so that it can store 10 integers
   	
   	//put the ten numbers from list into nums
   	
   }
   
   public void setNums(String list)
   {
   	//complete method setNums
   	
   }

	public String toString()
	{
		//you must write this method
		return "";
	}


	public static void main(String args[])
	{
		ArrayIVarsTwo test = new ArrayIVarsTwo("1 2 3 4 5 6 7 8 9 10");
		out.println(test);
		
		test.setNums("3 4 5 6 7 8 9 1 2 0");
		out.println(test);
	}
}
