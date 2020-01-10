

public class FindSmallest {


    public static void main(String args[]) {
        int a[] = {-99,1,2,3,4,5,6,7,8,9,10,12345};
        int b[] = {10,9,8,7,6,5,4,3,2,1,-99};
        int c[] = {10,20,30,40,50,-11818,40,30,20,10};
        int d[] = {32767};
        int e[] = {255,255};
        int f[] = {9,10,-88,100,-555,1000};

        System.out.println(findMin(a));
        System.out.println(findMin(b));
        System.out.println(findMin(c));
        System.out.println(findMin(d));
        System.out.println(findMin(e));
        System.out.println(findMin(f));

    }
    public static int findMin(int a[]) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}