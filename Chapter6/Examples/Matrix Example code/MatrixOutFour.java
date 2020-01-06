//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix output example 4 using a String 

import static java.lang.System.*;

public class MatrixOutFour
{
	public static void main(String args[])
	{
		int[][] mat = {{5,6,8,9},{2,3,5,0},{4,5,9,3}};

		String output="";
		for(int r=0; r<mat.length; r++)
		{
			output+="row "+ r + " ";
			for(int c=0; c<mat[0].length; c++)
			{
				output+=String.format("%4d",mat[r][c]);
			}
		   output+="\n";
		}
		out.println(output);
	}
}
