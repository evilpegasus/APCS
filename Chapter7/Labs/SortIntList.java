import java.util.*;

public class SortIntList extends IntList{
    public SortIntList(int size) {
        super(size);
    }

    public void add(int x) {
        if (numElements == list.length)
	    System.out.println("Can't add, list is full");
	    else {
		    for (int i = 0; i < list.length; i++) {
                if (x < list[i]) {
                    
                }
            }
	    }
        
    }
}