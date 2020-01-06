//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix instantiation example 

import static java.lang.System.*;
import java.util.*;

public class MatrixOne
{
	public static void main(String args[])
	{
		int[][] mat = new int[3][5];

		out.println(mat[2][1]);
		out.println(mat[1][2]);
		out.println(mat.length);
	
		out.println( Arrays.toString( mat[0] ) );
		out.println( Arrays.toString( mat[1] ) );
		out.println( Arrays.toString( mat[2] ) );	
		
		mat[0] = new int[]{3,4,5};
		
		out.println( Arrays.toString( mat[0] ) );
		out.println( Arrays.toString( mat[1] ) );
		out.println( Arrays.toString( mat[2] ) );
		
		int[][] aplus = {{6, 9, 2},{5, 3, 4, 6}};
		out.println( Arrays.toString( aplus[0] ) );
		out.println( Arrays.toString( aplus[1] ) );
	}
}