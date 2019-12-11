public class BiasedCoin {

    private double bias;
    boolean face;

    public BiasedCoin() {
        bias = 0.5;
        flip();
    }
    public BiasedCoin(double bias) {
        this.bias = bias;
        flip();
    }
    public boolean flip() {
        if (Math.random() < bias) {
            System.out.println("Heads");
            return face = true;
        } else {
            System.out.println("Tails");
            return face = false;
        }
    }
}