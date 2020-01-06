//********************************************************
//  Parameters.java
//
//  Illustrates the concept of a variable parameter list.
//********************************************************

import java.util.Scanner;

public class Parameters
{
    //-----------------------------------------------
    //  Calls the average and minimum methods with
    //  different numbers of parameters.
    //-----------------------------------------------
    public static void main(String[] args)
    {
        double mean1, mean2;

        mean1 = average(42, 69, 37);
        mean2 = average(35, 43, 93, 23, 40, 21, 75);
      
        System.out.println ("mean1 = " + mean1);
        System.out.println ("mean2 = " + mean2);
    }

    //----------------------------------------------
    //  Returns the average of its parameters.
    //----------------------------------------------
    public static double average (int ... list)
    {
        double result = 0.0;

        if (list.length != 0)
            {
                int sum = 0;
                for (int num: list)
                    sum += num;
                result = (double)sum / list.length;
            }

        return result;
    }
}