package Labs;
import java.util.Scanner;

public class BandSale {
    public static void main(String args[]) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Band Booster 1 name: ");
        String x = scan.nextLine();
        System.out.println("Band Booster 2 name: ");
        String y = scan.nextLine();

        BandBooster one = new BandBooster(x);
        BandBooster two = new BandBooster(y);

        System.out.println("Week 1 sales by " + one.getName());
        one.updateSales(scan.nextInt());

        System.out.println("Week 1 sales by " + two.getName());
        two.updateSales(scan.nextInt());

        System.out.println("Week 2 sales by " + one.getName());
        one.updateSales(scan.nextInt());

        System.out.println("Week 2 sales by " + two.getName());
        two.updateSales(scan.nextInt());

        System.out.println("Week 3 sales by " + one.getName());
        one.updateSales(scan.nextInt());

        System.out.println("Week 3 sales by " + two.getName());
        two.updateSales(scan.nextInt());

        System.out.println("Total Sales by " + one);
        System.out.println("Total Sales by " + two);

        scan.close();
    }
}
