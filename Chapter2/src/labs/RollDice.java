package labs;
import java.util.Random;;
public class RollDice {
	
	public static void main (String[] args) {
		int x = ((int)(Math.random() * 699)) / 100;
		System.out.println("Die 1: " + x);
		
		int y = ((int)(Math.random() * 699)) / 100;
		System.out.println("Die 2: " + y);
		
		int z = x + y;
		System.out.println("Sum: " + z);
	}
}