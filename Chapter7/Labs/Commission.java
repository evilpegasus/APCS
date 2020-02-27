package Chapter7.Labs;

public class Commission extends Hourly {

    private double sales;
    private double commission;

    public Commission(String eName, String eAddress, String ePhone,
    String socSecNumber, double rate, double commission) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commission = commission;
    }

    public void addSales(double totalSales) {
        sales += totalSales;
    }

    public double pay() {
        double payment = super.pay() + sales;
        sales = 0;
        return payment;
    }

    public String toString() {
        return super.toString() + "\nTotal Sales: " + sales;
    }
}