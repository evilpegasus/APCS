package Labs;

import java.util.Random;

public class Dice {
    Random r = new Random();
    public Dice() {

    }
    public int roll() {
        return r.nextInt(6) + 1;
    }
}