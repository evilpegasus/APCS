// **********************************************************
// Player.java
//
// Defines a Player class that holds information about an athlete.
// **********************************************************

import java.util.Scanner;

public class Player
{
    private String name;
    private String team;
    private int jerseyNumber;


    //-----------------------------------------------------------
    // Prompts for and reads in the player's name, team, and 
    // jersey number.
    //-----------------------------------------------------------

    public void readPlayer()
    {
	Scanner scan = new Scanner(System.in);
	System.out.print("Name: ");
	name = scan.nextLine();
	System.out.print("Team: ");
	team = scan.nextLine();
	System.out.print("Jersey number: ");
	jerseyNumber = scan.nextInt();
    }

}