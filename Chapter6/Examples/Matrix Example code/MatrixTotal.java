//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix total example 

import java.util.Scanner;
import static java.lang.System.*;

class MatrixTotal
{
	public static void main(String args[])
	{
		int total = 0;
		int[][] mat = {{5,6,8,9},
							{2,3,5,0},
							{4,5,9,3}};

		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[0].length; c++)
			{
				out.printf("%3d  ",mat[r][c]);
			}
			out.println();
		}

		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[0].length; c++)
			{
				total = total + mat[r][c];
			}
		}
		out.println("\ntotal : " + total);
	}
}