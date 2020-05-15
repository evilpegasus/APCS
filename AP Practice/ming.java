import java.util.*;

public class ming {
    public static void main(String args[]) {

    }

    //part A
    private ArrayList<Integer> digitList;

    public Digits(int num) {

        digitList = new ArrayList<Integer>();

        int remainder = num;
        while (remainder >= 10){
            digitList.add(0, remainder % 10);
            remainder = ((int)remainder / 10);
        }
        digitList.add(0, remainder);
    }






    //part B
    public boolean isStrictlyIncreasing() {
        if (digitList.size() < 2) {
            return true;
        } else {
            for (int i = 1; i < digitList.size(); i++) {
                if (digitList.get(i) < digitList.get(i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }
}