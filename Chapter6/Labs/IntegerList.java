import java.util.Arrays;


// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create & fill
// a list of integers.
//          
// ****************************************************************

public class IntegerList
{
    int[] list; //values in the list
    int count;

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
	list = new int[size];
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
	for (int i=0; i < list.length; i++)
        list[i] = (int)(Math.random() * 100) + 1;
    count = list.length;
    System.out.println("Count: " + count);
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
	for (int i=0; i<list.length; i++)
        System.out.println(i + ":\t" + list[i]);
    System.out.println("Count: " + count);    
    }
    //-------------------------------------------------------
    //double size
    //-------------------------------------------------------
    public void increaseSize() {
        int[] temp = new int[list.length];
        for (int i = 0; i < list.length; i++)  {
            temp[i] = list[i];
        }
        list = new int[2 * list.length];
        for (int i = 0; i < temp.length; i++)  {
            list[i] = temp[i];
        }
        //System.out.println(Arrays.toString(list));
     }

     public void addElement(int newVal) {
        if (count == list.length) {
            increaseSize();
        }
        list[count] = newVal;
        count++;
        System.out.println("Count: " + count);
     }

     public void removeAll(int val) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == val) {
                for (int j = i; j < (list.length - 1); j++) {
                    list[j] = list[j + 1];
                }
                count--;
                list[count] = 0;
                i--;
            }
        }
        System.out.println("Count: " + count);
     }
     
     public void removeFirst(int val) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == val) {
                for (int j = i; j < (list.length - 1); j++) {
                    list[j] = list[j + 1];
                }
                count--;
                list[count] = 0;
                System.out.println("Count: " + count);
                break;
            }
        }
     }
}