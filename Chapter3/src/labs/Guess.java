package labs;
// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
      int numToGuess;       //Number the user tries to guess
      int guess;            //The user's guess
      int count = 0;
      int high = 0;
      int low = 0;

	Scanner scan = new Scanner(System.in);
	Random generator = new Random();

	//randomly generate the  number to guess
	numToGuess = generator.nextInt(11);
	//System.out.println("Number to guess: " + numToGuess);

	//print message asking user to enter a guess

	//read in guess
	do {
		System.out.println("Guess a number please: ");
		guess = scan.nextInt();
		count++;
		System.out.println("You have guessed " + count + " times.");
		
		if(guess > numToGuess) {
			System.out.println("Too high");
			high++;
		} else if(guess < numToGuess) {
			System.out.println("Too low");
			low++;
		}

	}	while (guess != numToGuess);  //keep going as long as the guess is wrong
	System.out.println("CORRECT!");
	System.out.println("Guessed too high: " + high);
	System.out.println("Guessed too low: " + low);


	//print message saying guess is right
    }
}
