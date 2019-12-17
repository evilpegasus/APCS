import java.util.Scanner;

public class BiasedCoinTester {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        BiasedCoin x, y, z;
        int xCount = 0;
        int yCount = 0;
        int zCount = 0;


        x = new BiasedCoin();
        System.out.println("Enter first bias: ");
        y = new BiasedCoin(scan.nextDouble());
        System.out.println("Enter second bias: ");
        z = new BiasedCoin(scan.nextDouble());

        for (int i = 1; i <= 100; i++) {
            if (x.flip()) {
                xCount ++;
            }
            if (y.flip()) {
                yCount ++;
            }
            if (z.flip()) {
                zCount ++;
            }
        }
        System.out.println("Bias x: " + xCount);
        System.out.println("Bias y: " + yCount);
        System.out.println("Bias z: " + zCount);
        scan.close();
    }
}