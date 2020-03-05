// ****************************************************************
//   IntegerListS.java
//
//   Defines an IntegerListS class with methods to create, fill,
//   sort, and search in a list of integers. (Version S - 
//   for use in the linear search exercise.)
//          
// ****************************************************************


public class IntegerListS
{
    int[] list; //values in the list

    // ------------------------------------
    //   Creates a list of the given size
    // ------------------------------------
    public IntegerListS (int size)
    {
	list = new int[size];
    }

    // --------------------------------------------------------------
    //   Fills the array with integers between 1 and 100, inclusive
    // --------------------------------------------------------------
    public void randomize()
    {
	for (int i=0; i< list.length; i++)
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
    public int linearSearchRec(int target)
    {
	return linearSearchR (target, 0);
    }

    // -----------------------------------------------------------------
    //   Recursive implementation of the linear search - searches
    //   for target starting at index lo.
    // -----------------------------------------------------------------  
    private int linearSearchR (int target, int lo)
    {
	return -1;
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