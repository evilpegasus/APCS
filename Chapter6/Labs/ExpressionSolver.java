//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	//add in instance variables
	String expression;
	Integer answer;

	public ExpressionSolver(String s)
	{
		expression = s;
	}

	public void setExpression(String s)
	{
		expression = s;
	}

	public void solveExpression()
	{
		//Convert to ArrayList
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) != ' ') {
				a.add(String.valueOf(expression.charAt(i)));
			}
		}
		System.out.println(Arrays.toString(a.toArray()));

		//compute * and /
		if (a.indexOf("*") > 0 || a.indexOf("/") > 0) {
			
		}
	}

	public String toString( )
	{
		return null;
		//return (expression + " = " + Integer.toString(answer));
	}
}