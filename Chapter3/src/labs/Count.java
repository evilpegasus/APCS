package labs;
// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the 
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Count
{
  public static void main (String[] args)
  {
      String phrase = "";    // a string of characters
      int countBlank = 0;   // the number of blanks (spaces) in the phrase 
      int length;       // the length of the phrase
      char ch;          // an individual character in the string
      int countA = 0;
      int countE = 0;
      int countS = 0;
      int countT = 0;


	Scanner scan = new Scanner(System.in);
	while (!phrase.equalsIgnoreCase("quit")) {
		countA = 0;
	    countE = 0;
	    countS = 0;
	    countT = 0;
	    countBlank = 0;
      // Print a program header
      System.out.println ();
      System.out.println ("Character Counter");
      System.out.println ();

      // Read in a string and find its length
      System.out.print ("Enter a sentence or phrase: ");
      phrase = scan.nextLine();
      length = phrase.length();

      // Initialize counts
      countBlank = 0;

      // a for loop to go through the string character by character
      // and count the blank spaces
      for (int i = 0; i < length; i++) {
    	  ch = phrase.charAt(i);
    	  switch(ch) {
          case 'a':
        	  countA++;
        	  break;
          case 'A':
        	  countA++;
        	  break;
          case 'e':
        	  countE++;
        	  break;
          case 'E':
        	  countE++;
        	  break;
          case 's':
        	  countS++;
        	  break;
          case 'S':
        	  countS++;
        	  break;
          case 't':
        	  countT++;
        	  break;
          case 'T':
        	  countT++;
        	  break;
          case ' ':
        	  countBlank++;
        	  break;
          }
      }
      

      // Print the results
      System.out.println ();
      System.out.println ("Number of blank spaces: " + countBlank);
      System.out.println ("A: " + countA);
      System.out.println ("E: " + countE);
      System.out.println ("S: " + countS);
      System.out.println ("T: " + countT);
      
      System.out.println("Type \"Quit\" to quit");

	}
    }
}