// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SquareTest
{
    public static void main(String[] args) throws IOException
    {
    Scanner scan = new Scanner(new File("Chapter6\\Labs\\magicData.txt"));

	int count = 1;                 //count which square we're on
	int size = scan.nextInt();     //size of next square

	//Expecting -1 at bottom of input file
	while (size != -1)
	    {

		//create a new Square of the given size
			Square x = new Square(size);
		//call its read method to read the values of the square
			x.readSquare(scan);
		System.out.println("\n******** Square " + count + " ********");
		//print the square
			x.printSquare();
		//print the sums of its rows
		int rowSum = 0;
		for (int i = 0; i < size; i++) {
			rowSum += x.sumRow(i);
		}
		System.out.println(rowSum);
		//print the sums of its columns
		int colSum = 0;
		for (int i = 0; i < size; i++) {
			colSum += x.sumCol(i);
		}
		System.out.println(colSum);
		//print the sum of the main diagonal
		System.out.println(x.sumMainDiag());
		//print the sum of the other diagonal
		System.out.println(x.sumOtherDiag());
		//determine and print whether it is a magic square
		System.out.println(x.magic());
		//get size of next square
		size = scan.nextInt();
		count++;
	    }

   }
}