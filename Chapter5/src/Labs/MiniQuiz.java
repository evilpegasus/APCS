//********************************************************************
//  MiniQuiz.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a class that implements an interface.
//********************************************************************

import java.util.Scanner;

public class MiniQuiz
{
   //-----------------------------------------------------------------
   //  Presents a short quiz.
   //-----------------------------------------------------------------

   static Scanner scan = new Scanner(System.in);
   public static void main (String[] args)
   {
      Question q1 = new Question("", "");
      Question q2 = new Question("", "");
      askQuestion(q1, "What is the capital of Jamaica?", "Kingston", 4);
      askQuestion(q1, "Which is worse, ignorance or apathy?", "I don't know and I don't care", 10);
      // String possible;

      // Scanner scan = new Scanner(System.in);

      // q1 = new Question ("What is the capital of Jamaica?",
      //                    "Kingston");
      // q1.setComplexity (4);

      // q2 = new Question ("Which is worse, ignorance or apathy?",
      //                    "I don't know and I don't care");
      // q2.setComplexity (10);

      // System.out.print (q1.getQuestion());
      // System.out.println (" (Level: " + q1.getComplexity() + ")");
      // possible = scan.nextLine();
      // if (q1.answerCorrect(possible))
      //    System.out.println ("Correct");
      // else
      //    System.out.println ("No, the answer is " + q1.getAnswer());

      // System.out.println();
      // System.out.print (q2.getQuestion());
      // System.out.println (" (Level: " + q2.getComplexity() + ")");
      // possible = scan.nextLine();
      // if (q2.answerCorrect(possible))
      //    System.out.println ("Correct");
      // else
      //    System.out.println ("No, the answer is " + q2.getAnswer());
   }

   private static void askQuestion(Question q, String question, String answer, int level) {
      String possible;
      q = new Question (question, answer);
      q.setComplexity (level);
      System.out.print (q.getQuestion());
      System.out.println (" (Level: " + q.getComplexity() + ")");
      possible = scan.nextLine();
      if (q.answerCorrect(possible))
         System.out.println ("Correct");
      else
         System.out.println ("No, the answer is " + q.getAnswer());

      System.out.println();
   }
}