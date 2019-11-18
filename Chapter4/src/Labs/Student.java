package Labs;
// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student�s info. 
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data 
	String name;
	int test1;
    int test2;
    Scanner scan = new Scanner(System.in);


    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
    //add body of constructor
    name = studentName;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
    //add body of inputGrades
        System.out.println("Enter test1 score for " + name + ": ");
        test1 = scan.nextInt();

        System.out.println("Enter test2 score for " + name + ": ");
        test2 = scan.nextInt();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    public double getAverage()
    {
    //add body of getAverage
        return (test1 + test2) / 2.0;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------
    public String getName()
    //add header for printName
    {
        return name;
	//add body of printName
    }

    public String toString() {
        return "Name: " + name + "\tTest1: " + test1 + "\tTest2: " + test2;
    }

}