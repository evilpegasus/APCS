package Labs;

public class Rational{
    int num;
    int den;

    public Rational(int n, int d){
        num = n;
        den = d;
        if (den == 0) throw new IllegalArgumentException("Divide by zero error");
    }
    public static Rational add(Rational x, Rational y) {
        return new Rational(x.num * y.den + y.num * x.den, x.den * y.den);
    }
    public static Rational subtract(Rational x, Rational y) {
        return new Rational(x.num * y.den - y.num * x.den, x.den * y.den);
    }
    public static Rational multiply(Rational x, Rational y) {
        return new Rational(x.num * y.num, x.den * y.den);
    }
    public static Rational divide(Rational x, Rational y) {
        return new Rational(x.num * y.den, x.den * y.num);
    }

}