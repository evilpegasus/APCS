//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	//add in instance variables
	ArrayList<String> expression = new ArrayList<String>();

	public ExpressionSolver(String s)
	{
		expression.clear();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				expression.add(String.valueOf(s.charAt(i)));
			}
		}
		System.out.print(s + " = ");
	}

	public void setExpression(String s)
	{
		expression.clear();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				expression.add(String.valueOf(s.charAt(i)));
			}
		}
		System.out.print(s + " = ");
	}

	public void solveExpression()
	{
		for(int i = 0; i < expression.size(); i++) {
        	if(expression.get(i).equals("*")) {
				expression.set(i - 1, Integer.toString((Integer.parseInt(expression.get(i - 1)) * Integer.parseInt(expression.get(i + 1)))));
        		expression.remove(i + 1);
        		expression.remove(i);
				i--;
			}
        	else if(expression.get(i).equals("/")) {
				expression.set(i - 1, Integer.toString((Integer.parseInt(expression.get(i - 1)) / Integer.parseInt(expression.get(i + 1)))));
        		expression.remove(i + 1);
        		expression.remove(i);
				i--;
			}
		}
      	for(int i = 0; i<expression.size(); i++) {
			if(expression.get(i).equals("+")) {
				expression.set(i - 1, Integer.toString((Integer.parseInt(expression.get(i - 1)) + Integer.parseInt(expression.get(i + 1)))));
        		expression.remove(i + 1);
        		expression.remove(i);
				i--;
			}
			else if(expression.get(i).equals("-")) {
				expression.set(i - 1, Integer.toString((Integer.parseInt(expression.get(i - 1)) - Integer.parseInt(expression.get(i + 1)))));
        		expression.remove(i + 1);
        		expression.remove(i);
				i--;
			}
		}
	}

	public String toString( )
	{
		return expression.get(0);
	}
}