package labs;
// ********************************************************************
// Runs.java
//
// Finds the length of the longest run of heads in 100 flips of a coin.
// ********************************************************************

public class Runs
{
    public static void main (String[] args)
    {
	final int FLIPS = 100; // number of coin flip
	boolean prev;

	int currentRun = 0; // length of the current run of HEADS
	int maxRun = 0;     // length of the maximum run so far
	int count = 0;

	// Create a coin object
	Coin coin = new Coin();
	coin.flip();
	prev = coin.isHeads();

	// Flip the coin FLIPS times
	for (int i = 0; i < FLIPS; i++)
	    {
		// Flip the coin & print the result
		coin.flip();
		count++;
		System.out.println(coin.isHeads());
		System.out.println(count);

		// Update the run information
		if (true == prev && coin.isHeads()) {
			currentRun++;
		} else {
			currentRun = 0;
		}
		
		if (currentRun > maxRun) {
			maxRun = currentRun;
		}
		prev = coin.isHeads();
	    }

	// Print the results
	System.out.println("Max run of heads: " + maxRun);

    }
}