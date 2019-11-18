package labs;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.text.*;

public class test
{
      public static void main(String[ ] args) throws InterruptedException
      {
    	  Scanner scan = new Scanner(System.in);

    	  DecimalFormat fmt = new DecimalFormat("0.#");

    	  System.out.println("Enter value 1: ");

    	  int x = scan.nextInt();

    	  System.out.println("Enter value 2: ");

    	  int y = scan.nextInt();

    	  System.out.println("Enter value 3: ");

    	  int z = scan.nextInt();

    	  double sum = (double) x + y + z;

    	  double avg = sum / 3;

    	  System.out.println(fmt.format(avg));
      }
}