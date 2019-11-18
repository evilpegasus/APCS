package Labs;

import java.util.Scanner;

public class TestNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name1: ");
        String first = scan.nextLine();
        System.out.println("Enter middle name1: ");
        String middle = scan.nextLine();
        System.out.println("Enter last name1: ");
        String last = scan.nextLine();

        Name name1 = new Name(first, middle, last);

        System.out.println("Enter first name2: ");
        first = scan.nextLine();
        System.out.println("Enter middle name2: ");
        middle = scan.nextLine();
        System.out.println("Enter last name2: ");
        last = scan.nextLine();

        Name name2 = new Name(first, middle, last);

        System.out.println(name1.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println(name1.length());

        System.out.println(name2.firstMiddleLast());
        System.out.println(name2.lastFirstMiddle());
        System.out.println(name2.initials());
        System.out.println(name2.length());

        if (name1.equals(name2)) {
            System.out.println("Names are the same");
        } else {
            System.out.println("Names are not the same");
        }
    }
}