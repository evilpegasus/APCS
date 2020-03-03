package Chapter7.Labs;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class MultChoice extends TestQuestion {
    String[] s;
    private Scanner scan;
    String testQuestion;

    public MultChoice(int num, Scanner scan) {
        s = new String[num];
        this.scan = scan;
        readQuestion();
    }

    public void readQuestion() {
        testQuestion = scan.nextLine();

        for (int k = 0; k < s.length; k++) {
            s[k] = scan.nextLine();
        }
    }

    public String toString() {
        String ans = "";
        int letter = 97;

        for (int i = 0; i < s.length; i++) {
            ans += (char) letter + ") " + s[i] + "\n";
            letter++;
        }

        return testQuestion + "\n" + ans + "\n";
    }
}