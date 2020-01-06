//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix input example 

import java.util.Scanner;
import static java.lang.System.*;

class MatrixInOut
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(in);
		int[][] mat;
		out.print("What size do you want the matrix to be? :: " );
		int size = keyboard.nextInt();

		//you must give the matrix a size
		mat = new int[size][size];
		out.println("\n\n");

		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[0].length; c++)
			{
				out.print("Enter spot  " +r +" " + c + " : " );
				mat[r][c] = keyboard.nextInt();
			}
		}
		out.println();
		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[0].length; c++)
			{
				out.printf("%3d",mat[r][c]);
			}
			out.println();
		}
	}
}