package "";

public class tyler {
    //Tyler


        /*
        A
        */
        public Digits (int num) {
            digitList = new ArrayList<Integer>();

            if (num == 0) {
                digitList.add(0);
            }
            
            while (num > 0) {
                digitList.add(0, num % 10);
                num = num / 10;
            }
        }

        /*
        B
        */

        public boolean isStrictlyIncreasing() {

            if (digitList.size() == 1) {
                return true;
            }

            for (int i = 0; i < digitList.size() - 1; i++) {
                if (digitList.get(i) >= digitList.get(i + 1)) {
                    return false;
                }
            }

            return true;
        }

}