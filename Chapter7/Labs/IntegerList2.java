// ****************************************************************
// FILE:  IntegerList.java
//
// Purpose: Define an IntegerList class with methods to create, fill,
//          sort, and search in a list of integers.
//          
// ****************************************************************

import java.util.Scanner;

public class IntegerList
{
    int[] list; //values in the list

    //------------------------------------------------------------
    // Constructor -- takes an integer and creates a list of that
    // size.  All elements default to value 0.
    //------------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }


    //------------------------------------------------------------
    // randomize -- fills the array with randomly generated integers 
    // between 1 and 100, inclusive
    //------------------------------------------------------------
    public void randomize()
    {
        int max = list.length;
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * max) + 1;
    }


    //------------------------------------------------------------
    // fillSorted -- fills the array with sorted values
    //------------------------------------------------------------
    public void fillSorted()
    {
        for (int i=0; i<list.length; i++)
            list[i] = i + 2;
    }


    //------------------------------------------------------------
    // print -- prints array elements with indices, one per line
    //------------------------------------------------------------
    public String toString()
    {
        String s = "";
        for (int i=0; i<list.length; i++)
           s += i + ":\t" + list[i] + "\n";
        return s;
    }


    //------------------------------------------------------------
    // linearSearch -- takes a target value and returns the index
    // of the first occurrence of target in the list.  Returns -1 
    // if target does not appear in the list
    //------------------------------------------------------------
    public int linearSearch(int target)
    {
        int location = -1;
        for (int i=0; i<list.length && location == -1; i++)
            if (list[i] == target)
                location = i;
        return location;
    }

    
    //------------------------------------------------------------
    // sortIncreasing  -- uses selection sort
    //------------------------------------------------------------
    public void sortIncreasing()
    {
        for (int i=0; i<list.length-1; i++)
            {
                int minIndex = minIndex(list, i);
                swap(list, i, minIndex);
            }
    }
}