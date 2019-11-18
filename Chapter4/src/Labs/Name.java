package Labs;

public class Name{
    String f;
    String m;
    String l;
    public Name(String first, String middle, String last){
        f = first;
        m = middle;
        l = last;
    }
    public String getFirst(){
        return f;
    }
    public String getMiddle(){
        return m;
    }
    public String getLast(){
        return l;
    }
    public String firstMiddleLast() {
        return f + " " + m + " " + l;
    }
    public String lastFirstMiddle() {
        return l + " " + f + " " + m;
    }
    public String initials() {
        return f.substring(0, 1).toUpperCase() + m.substring(0, 1).toUpperCase() + l.substring(0, 1).toUpperCase();
    }
    public boolean equals(Name otherName) {
        return (f + m + l).equalsIgnoreCase(otherName.f + otherName.m + otherName.l);
    }
    public int length() {
        return (f+m+l).length();
    }
}