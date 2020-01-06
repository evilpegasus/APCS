//(c) A+ Computer Science
// www.apluscompsci.com

//setting matrix values example 2 

import static java.lang.System.*;

public class MatrixSetTwo
{
	public static void main(String args[])
	{
		int[][] mat = new int[5][5];

		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[0].length; c++)
			{
				mat[r][c] = r*c;
			}
		}

		for(int r=0; r<mat.length; r++)
		{
			out.print("row "+ r + " ");
			for(int c=0; c<mat[0].length; c++)
			{
				out.printf("%3d",mat[r][c]);
			}
			out.println();
		}
	}
}