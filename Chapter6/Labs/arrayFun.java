public class arrayFun {


    public static void main(String args[]) {
        int a[] = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
        int b[] = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 3; i <= 6; i++) {
            sum1 += a[i];
        }
        System.out.println(sum1);

        for (int i = 2; i <= 9; i++) {
            sum2 += a[i];
        }
        System.out.println(sum2);
    }

    public int sum(int[] a, int start, int stop) {
        return 0;
    }
    public int count(int[] a, int b) {
        return 0;
    }
    public int[] remove(int[] a, int b) {
        return null;
    }
}