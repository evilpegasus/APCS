//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix instantiation example 

import static java.lang.System.*;

public class MatrixTwo
{
	public static void main(String args[])
	{
		int[][] mat = {{5,7,9,2,1,9},
									{5,3,4},
									{3,7,0,8,9}};

		out.println(mat[2][1]);
		out.println(mat[1][2]);
		out.println(mat[0][3]);
		out.println(mat[2][4]);
		out.println(mat[7/4][0]);
		out.println(mat[1*2][2]);
		out.println(mat.length);
		out.println(mat[0].length);
	}
}