
import java.util.Arrays;

public class arrayFun {


    public static void main(String args[]) {
        int a[] = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
        int b[] = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};

        System.out.println(sum(a, 3, 6));
        System.out.println(sum(a, 2, 9));

        System.out.println(count(a, 4));
        System.out.println(count(a, 9));
        System.out.println(count(a, 7));

        int removed[] = remove(a, 7);
        System.out.println(Arrays.toString(removed));
        System.out.println(count(removed, 7));
    }

    public static int sum(int[] a, int start, int stop) {
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum += a[i];
        }
        return sum;
    }
    public static int count(int[] a, int b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                count ++;
            }
        }
        return count;
    }
    public static int[] remove(int[] a, int b) {
        int x[] = new int[a.length - count(a, b)];
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b) {
                x[i - c] = a[i];
            } else {
                 c++;
            }
        }
        return x;
    }
}