package Chapter7.Labs;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class MultChoice extends TestQuestion {


    protected String testQuestion;
    private int numChoices;
    private String choices[];

    public void readQuestion() throws FileNotFoundException {
        File file = new File("testbank.dat");
        Scanner scan = new Scanner(file);
        numChoices = Integer.valueOf(scan.nextLine());
        testQuestion = scan.nextLine();
        String choices[] = new String[numChoices];
        for (int i = 0; i < numChoices; i++) {
            choices[i] = scan.nextLine();
        }
    }

    public String toString() {
        String returned = testQuestion;
        for (int i = 0; i < numChoices; i++) {
            returned += "\n" + choices[i];
        }
        return returned;
    }
}