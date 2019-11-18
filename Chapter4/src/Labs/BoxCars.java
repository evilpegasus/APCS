package Labs;

public class BoxCars {
    public static void main(String args[]) {
        int n = 1000;
        int box = 0;
        PairOfDice dice = new PairOfDice();
        for (int i = 1; i <= n; i++) {
            int roll = dice.roll();
            System.out.println(i + ":\t" + roll);
            if (roll == 12) box++;
        }
        System.out.println("You rolled box cars " + box + " times");
    }
}