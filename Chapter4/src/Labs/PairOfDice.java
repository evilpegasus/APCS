package Labs;

public class PairOfDice{
    int roll1;
    int roll2;
    Dice dice = new Dice();

    public PairOfDice(){

    }
    public int roll(){
        roll1 = dice.roll();
        roll2 = dice.roll();

        return roll1 + roll2;
    }
}