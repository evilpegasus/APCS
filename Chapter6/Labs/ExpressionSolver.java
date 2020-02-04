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
	ArrayList<String> expression = new ArrayList<String>();

	public ExpressionSolver(String s)
	{
		expression.clear();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				expression.add(String.valueOf(s.charAt(i)));
			}
		}
	}

	public void setExpression(String s)
	{
		expression.clear();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				expression.add(String.valueOf(s.charAt(i)));
			}
		}
	}

	public void solveExpression()
	{
		//Convert to ArrayList
            ArrayList<String> a = new ArrayList<String>();
            for (int i = 0; i < expression.length(); i++) {
                    if (expression.charAt(i) != ' ') {
                            a.add(String.valueOf(expression.charAt(i)));
	}

	public String toString( )
	{
		return expression.toString();
	}
}