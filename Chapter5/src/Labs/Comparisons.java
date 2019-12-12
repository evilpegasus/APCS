import java.util.Scanner;

public class Comparisons {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Comparable val1;
        Comparable val2;
        Comparable val3;

        System.out.println("Enter 3 Strings");
        val1 = scan.nextLine();
        val2 = scan.nextLine();
        val3 = scan.nextLine();

        System.out.println("The largest is " + Compare3.largest(val1, val2, val3));

        System.out.println("Enter 3 ints");
        val1 = scan.nextInt();
        val2 = scan.nextInt();
        val3 = scan.nextInt();

        System.out.println("The largest is " + Compare3.largest(val1, val2, val3));
    }
}