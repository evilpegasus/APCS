package Chapter7.Labs;

import java.util.*;
import java.io.*;

public class WriteTest {

    public static void main(String args[]) throws FileNotFoundException {
        TestQuestion[] test;
        int numAnswers, numLines;

        File file = new File("Chapter7/Labs/testbank.dat");
        Scanner scan = new Scanner(file);

        int numQuestions = scan.nextInt();
        scan.nextLine();
        test = new TestQuestion[numQuestions];

        for (int i = 0; i < numQuestions; i++) {
            if (scan.next().charAt(0) == 'e') {
                numLines = scan.nextInt();
                scan.nextLine();
                test[i] = new Essay(numLines, scan);
            } else {
                numAnswers = scan.nextInt();
                scan.nextLine();
                test[i] = new MultChoice(numAnswers, scan);
            }
        }

        for (int a = 0; a < numQuestions; a++) {
            System.out.print(1 + a + ". " + test[a].toString());
        }

        // ArrayList<String> lines = new ArrayList<String>();
        // while(scan.hasNextLine()) {
        //     lines.add(scan.nextLine());
        // }
        // System.out.println(lines);
    }
}