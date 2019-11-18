package labs;
import java.util.Scanner;

public class StringManips {
	
	public static void main (String[] args) {
		String phrase = new String ("This is a String test.");
		String middle3 = phrase.substring(phrase.length()/2-1, phrase.length()/2+2);
		System.out.println(phrase);
		System.out.println(middle3);
		
		String firstHalf = phrase.substring(0, phrase.length()/2);
		String secondHalf = phrase.substring(phrase.length()/2, phrase.length());
		
		String switchedPhrase = secondHalf.concat(firstHalf);
		switchedPhrase = switchedPhrase.replace(" ", "*");
		System.out.println(switchedPhrase);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("State: ");
		String state = scan.nextLine();
		System.out.println();
		System.out.print("City: ");
		String city = scan.nextLine();
		System.out.println();
		System.out.println(state.toUpperCase() + city.toLowerCase() + state.toUpperCase());
	}
}