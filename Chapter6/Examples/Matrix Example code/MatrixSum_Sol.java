//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix sum example 

import static java.lang.System.*;

public class MatrixSum_Sol
{
	/*
	 *  method sumMat should sum all values
	 *  in matrix mat
	 */
	public static int sumMat( int[][] mat )
	{
		int sum = 0;
		for( int[] row : mat )
		{
		   for( int num : row )
		   {
		      sum = sum + num;
		   }
		}
		return sum;
	}

	public static void main(String args[])
	{
		int[][] twoDRay = {{5,7},{5,3,4,6},{0,8,9}};
		System.out.println( sumMat( twoDRay ) );
	}
}