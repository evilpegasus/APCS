package Labs;
public class Compare3 {
    public Compare3() {

    }
    public static Comparable largest(Comparable a, Comparable b, Comparable c) {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            return a;
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            return b;
        } else {
            return c;
        }
    }
}