package labs;
// ***************************************************************
//   Election.java
//
//   This file contains a program that tallies the results of
//   an election.  It reads in the number of votes for each of
//   two candidates in each of several precincts.  It determines
//   the total number of votes received by each candidate, the
//   percent of votes received by each candidate, the number of 
//   precincts each candidate carries, and the 
//   maximum winning margin in a precinct.
// **************************************************************

import java.util.Scanner;

public class Election
{
    public static void main (String[] args)
    {
	int votesForPolly;  // number of votes for Polly in each precinct
	int votesForErnest; // number of votes for Ernest in each precinct
	int totalPolly;     // running total of votes for Polly
	int totalErnest;    // running total of votes for Ernest
	int pollyWins = 0;
	int ernestWins = 0;
	int tie = 0;
	
	String response;    // answer (y or n) to the "more precincts" question

	Scanner scan = new Scanner(System.in);

	System.out.println ();
	System.out.println ("Election Day Vote Counting Program");
	System.out.println ();

	// Initializations
	votesForPolly = 0;
	votesForErnest = 0;
	totalPolly = 0;
	totalErnest = 0;
	response = "y";
	// Loop to "process" the votes in each precinct
	while (response.equalsIgnoreCase("y")) {
		System.out.println("Votes for Polly? ");
		votesForPolly = scan.nextInt();
		System.out.println("Votes for Ernest? ");
		votesForErnest = scan.nextInt();
		
		totalPolly += votesForPolly;
		totalErnest += votesForErnest;
		if (totalPolly > totalErnest) {
			pollyWins++;
		} else if (totalErnest > totalPolly) {
			ernestWins++;
		} else {
			tie++;
		}
		
		System.out.println("More precincts? (y/n)");
		response = scan.next();
	}
	
	// Print out the results
	
	System.out.println("Results");
	System.out.println("===================");
	System.out.println("Polly Total Votes: " + totalPolly + " or " + (double)(100.0 * totalPolly/((double)totalPolly+totalErnest)) + "%");
	System.out.println("Polly won: " + pollyWins + " precincts");
	System.out.println();
	System.out.println("Ernest Total Votes: " + totalErnest + " or " + (double)(100.0 * totalErnest/((double)totalPolly+totalErnest)) + "%");
	System.out.println("Ernest won: " + ernestWins + " precincts");

	
	
    }
}