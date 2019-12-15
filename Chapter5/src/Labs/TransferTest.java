import java.util.Scanner;

public class TransferTest {


    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        String again;
        Account x = new Account(1000, "Joe");
        Account y = new Account(500, "Mama");
        String sender;

        System.out.println(x.toString());
        System.out.println(y.toString());

        System.out.println("Transfer money? (Y/N)");
        again = scan.nextLine();

        while (again.equalsIgnoreCase("y")) {
            System.out.println("Type the name of the account sending money: ");
            sender = scan.nextLine();
            if (sender.equalsIgnoreCase("Joe")) {
                System.out.println("How much money to transfer?");
                x.transfer(y, scan.nextInt());
            } else if (sender.equalsIgnoreCase("Mama")) {
                System.out.println("How much money to transfer?");
                y.transfer(x, scan.nextInt());
            }

            System.out.println(x.toString());
            System.out.println(y.toString());

            System.out.println("Transfer more money? (Y/N)");
            //Something is wrong with the scanner and it skips over the first one...
            scan.nextLine();
            again = scan.nextLine();
        }
    }
}