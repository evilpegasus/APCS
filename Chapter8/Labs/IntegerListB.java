// ****************************************************************
//   IntegerListB.java
//
//   Defines an IntegerList class with methods to create, fill,
//   sort, and search in a list of integers. (Version B - for use
//   in the binary search lab exercise)
//          
// ****************************************************************

public class IntegerListB
{
    int[] list; //values in the list

    // ------------------------------------
    //   Creates a list of the given size
    // ------------------------------------
    public IntegerListB (int size)
    {
	list = new int[size];
    }

    // --------------------------------------------------------------
    //   Fills the array with integers between 1 and 100, inclusive
    // --------------------------------------------------------------
    public void randomize()
    {
	for (int i=0; i<list.length; i++)
	    list[i] = (int)(Math.random() * 100) + 1;
    }

    // ----------------------------------------
    //   Prints array elements with indices
    // ----------------------------------------
    public void print()
    {
	for (int i=0; i<list.length; i++)
	    System.out.println(i + ":\t" + list[i]);
    }

    // ------------------------------------------------------------------
    //   Returns the index of the first occurrence of target in the list.
    //   Returns -1 if target does not appear in the list.
    // ------------------------------------------------------------------
    public int linearSearch(int target)
    {
	int location = -1;
	for (int i=0; i<list.length && location == -1; i++)
	    if (list[i] == target)
		location = i;
	return location;
    }

    // -----------------------------------------------------------------
    //   Returns the index of an occurrence of target in the list, -1
    //   if target does not appear in the list.
    // -----------------------------------------------------------------
    public int binarySearchRec(int target)
    {
	return binarySearchR (target, 0, list.length-1);
    }

    // -----------------------------------------------------------------
    //   Recursive implementation of the binary search algorithm.
    //   If the list is sorted the index of an occurrence of the 
    //   target is returned (or -1 if the target is not in the list).
    // -----------------------------------------------------------------  
    private int binarySearchR (int target, int lo, int hi)
    {
	int index;

	// fill in code for the search

	return index;
    }

    // ------------------------------------------------------------------------
    //  Sorts the list into ascending order using the selection sort algorithm.
    // ------------------------------------------------------------------------
    public void selectionSort()
    {
	int minIndex;
	for (int i=0; i < list.length-1; i++)
	    {
		//find smallest element in list starting at location i
		minIndex = i;
		for (int j = i+1; j < list.length; j++)
		    if (list[j] < list[minIndex])
			    minIndex = j;

		//swap list[i] with smallest element
		int temp = list[i];
		list[i] = list[minIndex];
		list[minIndex] = temp;
	    }
    }
    
}