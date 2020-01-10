public class Repeats {
    public static void main(String args[]) {
        int a[] = {-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5};
        int b[] = {10,9,8,7,6,5,4,3,2,1,-99};
        int c[] = {10,20,30,40,50,10,10,40,30,20,10};
        int d[] = {32767};
        int e[] = {255,255};
        int f[] = {9,10,-88,100,-555,1000};
        int g[] = {10,10,10,11,456,10,10,2,2,2,2,2,2,2};
        int h[] = {-111,1,2,3,9,11,20,30};
        int i[] = {9,8,7,6,5,4,3,2,0,-2,-989};
        int j[] = {12,12,15,18,21,23,1000};
        int k[] = {250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1};
        int l[] = {9,10,-8,10000,-5000,1000};

        System.out.println(checkRepeat(a));
        System.out.println(checkRepeat(b));
        System.out.println(checkRepeat(c));
        System.out.println(checkRepeat(d));
        System.out.println(checkRepeat(e));
        System.out.println(checkRepeat(f));
        System.out.println(checkRepeat(g));
        System.out.println(checkRepeat(h));
        System.out.println(checkRepeat(i));
        System.out.println(checkRepeat(j));
        System.out.println(checkRepeat(k));
        System.out.println(checkRepeat(l));


    }
    public static boolean checkRepeat(int x[]) {
        for (int i = 0; i < x.length; i++) {
            for(int j = i + 1; j < x.length; j++) {
                if(x[i] == x[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}