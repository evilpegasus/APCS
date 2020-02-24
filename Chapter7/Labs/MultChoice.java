import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class MultChoice extends TestQuestion {


    protected String testQuestion;
    private int numChoices;
    private String choices[];

    public void readQuestion() {
        File file = new File("testbank.dat");
        try {
            Scanner scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        numChoices = Integer.toString(scan.nextLine());
        testQuestion = scan.nextLine();
        String choices[] = new String[numChoices];
        for (int i = 0; i < numChoices; i++) {
            choices[i] = scan.NextLine();
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