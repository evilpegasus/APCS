public class Problem2 {
    



    //part A
    public static int calculuteBonus(int goal, int numDays) {
        int totalBonus = 0;
        for (int i = 1; i <= numDays; i++) {
            if (SalesSimulator.getSales() >= goal) {
                totalBonus += 75;
            } else if (SalesSimulator.getSales() >= (0.8 * goal) && SalesSimulator.getSales() < goal) {
                totalBonus += 50;
            }
        }
        return totalBonus;
    }






    //part B
    The SalesSimulator class needs a new private static final variable:
    private static final int dailyGoal;
    This variable will be passed into calculuteBonus as the goal parameter.






}