package labs;

import java.util.Scanner;

public class IntWrapper {
	public static void main (String[] args) {
		System.out.print("Enter an int: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("Binary: " + Integer.toBinaryString(x));
		System.out.println("Octal: " + Integer.toOctalString(x));
		System.out.println("Hex: " + Integer.toHexString(x));
		
		System.out.println();
		System.out.println("Max integer = " + Integer.MAX_VALUE);
		System.out.println("Min integer = " + Integer.MIN_VALUE);
		System.out.println();
		
		System.out.print("Enter a decimal integer: ");
		String a = scan.next();
		System.out.println();
		System.out.print("Enter another decimal integer: ");
		String b = scan.next();
		System.out.println();

		int sum = Integer.valueOf(a) + Integer.valueOf(b);
		System.out.println("The integer sum is: " + sum);
	}
}