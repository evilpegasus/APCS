package Chapter8.Labs;

// ******************************************************************
//   Fib.java
//
//   A utility class that provide methods to compute elements of the
//   Fibonacci sequence.
// ******************************************************************
public class Fib
{

    //--------------------------------------------------------------
    // Recursively computes fib(n)
    //--------------------------------------------------------------
    public static int fib1(int n)
    {
        System.out.println("In fib1(" + n + ")");
        if ( n == 0) {
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return (fib1(n-1) + fib1(n-2));
        }
	//Fill in code -- this should look very much like the
	//mathematical specification
    }

    public static int fib2(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[arr.length - 1];
    }
}