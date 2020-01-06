//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix output example 3 

import static java.lang.System.*;

public class MatrixOutThree_Sol
{
	public static void main(String args[])
	{
		int[][] mat = {{5,6,8,9},
							{2,3,5,0},
							{4,5,9,3}};

		for(int r=0; r<mat.length; r++)
		{
			out.print("row "+ r + " ");
			for(int c=0; c<mat[r].length; c++)
			{
				out.printf("%3d",mat[r][c]);
			}
			out.println();
		}
	}
}
