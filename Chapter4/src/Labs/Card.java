package Labs;

public class Card {
    String cardValue;
    String cardSuit;

    public Card(int value, int suit){
        switch(value) {
            case 11:
                cardValue = "Jack";
                break;
            case 12:
                cardValue = "Queen";
                break;
            case 13:
                cardValue = "King";
                break;
            default:
                cardValue = value + "";
                break;
        }
        switch(suit) {
            case 1:
                cardSuit = "Spades";
                break;
            case 2:
                cardSuit = "Clubs";
                break;
            case 3:
                cardSuit = "Diamonds";
                break;
            case 0:
                cardSuit = "Hearts";
                break;
            default:
                cardSuit = "error";
                break;
        }
    }
    public String getCard(){
        return cardValue + " of " + cardSuit;
    }
}