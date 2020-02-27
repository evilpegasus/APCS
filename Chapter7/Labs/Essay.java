package Chapter7.Labs;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class Essay extends TestQuestion {


    protected String testQuestion;
    private int numLines;
    public void readQuestion() throws FileNotFoundException {
        File file = new File("testbank.dat");
        Scanner scan = new Scanner(file);
        numLines = Integer.valueOf(scan.nextLine());
        testQuestion = scan.nextLine();
    }

    public String toString() {
        String returned = testQuestion;
        for (int i = 0; i < numLines; i++) {
            returned += "\n";
        }
        return returned;
    }
}