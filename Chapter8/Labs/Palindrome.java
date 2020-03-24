package Chapter8.Labs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        String s;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        s = scan.nextLine();

        System.out.println("Is " + s + " a palindrome?");
        System.out.println(palindrome(s));
    }

    public static boolean palindrome(String s) {
        if (s.length() < 2) {
            return true;
        } else {
            return (s.charAt(0) == s.charAt(s.length()-1) && palindrome(s.substring(1, s.length()-1)));
        }
    }
}