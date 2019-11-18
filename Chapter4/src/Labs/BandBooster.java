package Labs;

public class BandBooster {
    String name;
    int boxesSold;

    public BandBooster(String n) {
        name = n;
        boxesSold = 0;
    }

    public String getName() {
        return name;
    }

    public void updateSales(int x) {
        boxesSold += x;
    }

    public String toString() {
        return name + ": " + boxesSold;
    }











}