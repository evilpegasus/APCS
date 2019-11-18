package Labs;

import java.util.Random;

public class CardTester {
    public static void main(String args[]) {
        Random r = new Random();
        for (int i = 1; i <= 40; i++) {
            int cardChoice = r.nextInt(51) + 1;
            Card card = new Card(cardChoice % 13, cardChoice / 13);
            System.out.println(i + ":\t" + card.getCard());
        }
    }
}