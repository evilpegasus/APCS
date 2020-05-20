public class Problem1 {
    



    //part A
    public boolean couponApplies() {
        for (int i = 0; i < check.size(); i++) {
            if (check.get(i).isDailySpecial() == true) {
                return false;
            }
        }
        if (totalPrices() < 40) {
            return false;
        } else {
            return true;
        }
    }




    //part B
    public double calculateCheck() {
        double originalPrice = totalPrices();
        double newPrice = totalPrices();
        if (couponApplies() == true) {
            newPrice = newPrice - (originalPrice * 0.25);
        }
        int countEntrees = 0;
        for (int i = 0; i < check.size(); i++) {
            if(check.get(i).isEntree() == true) {
                countEntrees++;
            }
        }
        if (countEntrees > 5) {
            newPrice = newPrice + (0.2 * originalPrice);
        }
        return newPrice;
    }




    //part C
    /*
    Method header to be implemented in the CustomerCheck class:
    public boolean hasPremiumEntrees();

    The MenuItem class needs a new method public that returns a boolean depending on if a menu item is a premium entree. This will be called by hasPremiumEntrees to check items.
    public boolean isPremiumEntree();

    The calculateCheck method needs to be modified so countEntrees also counts Premium Entrees in order to correctly determine the numbmer of people.
    */









}