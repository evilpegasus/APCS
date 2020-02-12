import java.util.*;

public class SortIntList extends IntList{
    public SortIntList(int size) {
        super(size);
    }

    public void add(int x) {
        if (numElements == list.length)
	    System.out.println("Can't add, list is full");
	    else {
            list[numElements] = x;
		    Arrays.sort(list, 0, numElements + 1);
            numElements++;
            // for (int i = 0; i < numElements; i++) {
            //     if (list[i] < list[i + 1]) {
            //         for (int j = numElements; j > i; j++) {
            //             list[j] = list [j - 1];
            //         }
            //         list[i] = x;
            //         break;
            //     }
            //     numElements++;
        }
    }
}