package Chapter7.Labs;

// ******************************************************
//   Numbers.java
//
//   Demonstrates selectionSort on an array of integers.
// ******************************************************

import java.util.Scanner;

public class Strings
{
    // --------------------------------------------
    //  Reads in an array of integers, sorts them,
    //  then prints them in sorted order.
    // --------------------------------------------
    public static void main (String[] args)
    {
        Comparable[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print ("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        stringList = new Comparable[size];

        System.out.println ("\nEnter the strings...");
        for (int i = 0; i < size; i++)
            stringList[i] = scan.nextLine();

        Sorting.insertionSort(stringList);

        System.out.println ("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(stringList[i] + "  ");
        System.out.println ();
    }
}