//(c) A+ Computer Science
// www.apluscompsci.com

//matrix parameter example 

import static java.lang.System.*;

public class MatrixParams
{
   private int[][] mat;			//instance var / data field

	public MatrixParams()
	{
      mat = new int[4][5];		//4 rows and 5 columns
	}

   public void changeRow(int r)
   {
      out.println("\nchangeRow()");
      setVals(mat[r]);  	//pass row r to setVals
   }

   public void setVals(int[] ray)
   {
      out.println("\nsetVals");
      ray[1]=89;
      ray[2]=87;
      ray[3]=71;
   }

   public String toString()
   {
		String output="";
		for( int r = 0; r < mat.length; r++)
		{
			for( int c = 0; c < mat[0].length; c++)
			{
				output+=mat[r][c]+ "\t";
			}
			output+="\n";
		}
		return output;
   }

   public static void main(String args[])
   {
      MatrixParams test = new MatrixParams();
      test.changeRow(1);
      test.changeRow(3);
      System.out.println(test);
   }
}