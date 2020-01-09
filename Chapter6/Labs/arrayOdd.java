import java.util.Arrays;

public class arrayOdd {

    public static void main(String args[]) {
        int [] Array1 = {2,4,6,8,10,12,14};
        int [] Array2 = {2,3,4,5,6,7,8,9};
        int [] Array3 = {2,10,20,21,23,24,40,55,60,61};

        odds(Array1);
        odds(Array2);
        odds(Array3);
    }

    public static void odds(int a[]) {
        int oddCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oddCount++;
            }
        }
        int evenCount = a.length - oddCount;

        int odd[] = new int[oddCount];
        int even[] = new int[evenCount];
        int o = 0;
        int e = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                odd[o] = a[i];
                o++;
            } else {
                even[e] = a[i];
                e++;
            }
        }
        System.out.println("Odd: " + Arrays.toString(odd));
        System.out.println("Even: " + Arrays.toString(even));
    }
}