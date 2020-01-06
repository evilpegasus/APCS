//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix search example 

import static java.lang.System.*;

public class MatrixSearch_Sol
{
	/*
	 *  method searchMat should determine how many
	 *  occurrences of toFind exist in the matrix mat
	 */
	public static int searchMat( int[][] mat, int toFind)
	{
		int count = 0;
		for( int[] row : mat )
		{
		   for( int num : row )
		   {
		      if( num == toFind )
		        count++;
		   }
		}
		return count;
	}

	public static void main(String args[])
	{
		int[][] twoDRay = {{5,7,2,2},{7,7,5,3,4,6},{0,8,9,7,2,3,4,5}};
		System.out.println( searchMat( twoDRay, 7) );
	}
}