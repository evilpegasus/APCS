import java.util.*;

public class SortIntList extends IntList{
    public SortIntList(int size) {
        super(size);
    }

    public void add(int x) {
        if (numElements == list.length)
	    System.out.println("Can't add, list is full");
	    else {
		    for (int i = 0; i < numElements; i++) {
                if (x < list[i + 1] || numElements == 0) {
                    for (int j = numElements + 1; j > i; j--) {
                        list[j] = list[j - 1];
                    }
                    list[i] = x;
                }
            }
            numElements++;
	    }
        
    }
}