//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix output example 2 

import static java.lang.System.*;

public class MatrixOutTwo
{
	public static void main(String args[])
	{
		int[][] mat = {{5,6,8,9},
							{2,3,5,0},
							{4,5,9,3}};


		//change the 2 to a 0
		for(int c=0; c<mat[2].length; c++)
		{
			out.printf("%3d",mat[2][c]);
		}
		out.println();
	}
}
