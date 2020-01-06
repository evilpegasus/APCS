//******************************************************************** 
// TwoDArray.java              Author: Lewis/Loftus/Cocking 
// 
// Demonstrates the use of a two-dimensional array. 
//******************************************************************** 

public class TwoDArray 
{ 
   //----------------------------------------------------------------- 
   // Creates a 2D array of integers, fills it with increasing 
   // integer values, then prints them out. 
   //----------------------------------------------------------------- 
   public static void main (String[] args) 
   { 
      int[][] table = new int[5][10]; 

      // Load the table with values 
      for (int row=0; row < table.length; row++) 
         for (int col=0; col < table[row].length; col++) 
            table[row][col] = row * 10 + col; 

      // Print the table 
      for (int row=0; row < table.length; row++) 
      { 
         for (int col=0; col < table[row].length; col++) 
            System.out.print (table[row][col] + "\t"); 
         System.out.println(); 
      } 
   } 
} 
