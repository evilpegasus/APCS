import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements in array?");
        int length = scan.nextInt();
        scan.nextLine();
        String a[] = new String[length];

        System.out.println("Enter elements: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter element " + i);
            a[i] = scan.nextLine();
        }

        System.out.println(Arrays.toString(a));

        //reverse it
        for(int i = 0; i < (int)((a.length-1)/2); i++) {
            String temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        System.out.print(Arrays.toString(a));
    }
}