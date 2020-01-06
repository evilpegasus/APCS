//(c) A+ Computer Science
// www.apluscompsci.com

//setting matrix values example 1 

import static java.lang.System.*;

public class MatrixSetOne
{
	public static void main(String args[])
	{
		int[][] mat = new int[5][5];
		mat[2][2]=7;
		mat[0][3]=5;
		mat[4][1]=3;

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