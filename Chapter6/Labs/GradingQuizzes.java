import java.util.Scanner;
import java.util.Arrays;

public class GradingQuizzes {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many questions?");
        int questions = scan.nextInt();   

        int q[] = new int[questions];
        System.out.println("Enter answer key: ");
        scan.nextLine();
        String key = scan.nextLine();

        for(int i = 0; i < q.length-1; i++) {
            int space = key.indexOf(" ");
            q[i] = Integer.parseInt(key.substring(0, space));
            //delete space and everything before
            key = key.substring(space +1, key.length());
        }
        q[q.length-1] = Integer.parseInt(key);


        System.out.println("Key:");
        System.out.println(Arrays.toString(q));

        String again = "y";
        while(again.equalsIgnoreCase("y")) {
            int score = 0;

            System.out.println("Enter answers to be graded:");
            String a = scan.nextLine();

            for(int i = 0; i < q.length-1; i++) {
                int space = a.indexOf(" ");
                if(q[i] == Integer.parseInt(a.substring(0, space))) {
                    score++;
                };
                //delete space and everything before
                a = a.substring(space +1, a.length());
            }
            if(q[q.length - 1] == Integer.parseInt(a)) {
                score++;
            };
            System.out.println("Score: " + score + "/" + q.length + " (" + (double)(100 * score/q.length)+ "%)");

            System.out.println("Continue? (y/n)");
            again = scan.nextLine();
        }
    }
}