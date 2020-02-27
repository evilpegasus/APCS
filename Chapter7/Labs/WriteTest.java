package Chapter7.Labs;

import java.util.*;
import java.io.*;

public class WriteTest {

    public static void main(String args[]) throws FileNotFoundException {
        Essay e = new Essay();
        MultChoice m = new MultChoice();

        File file = new File("Chapter7/Labs/testbank.dat");
        Scanner scan = new Scanner(file);
        int numQuestions = Integer.valueOf(scan.nextLine());
        for(int i = 0; i < numQuestions; i++ ) {
            if(scan.nextLine() == "e") {
                e.readQuestion();
                System.out.println(e);
            } else if (scan.nextLine() == "m") {
                m.readQuestion();
                System.out.println(m);
            }
        }
        
    }
}