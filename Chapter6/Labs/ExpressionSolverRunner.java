//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner
{
	public static void main( String args[] )
	{
		ExpressionSolver es = new ExpressionSolver("3 + 5");
		es.solveExpression();
		System.out.println(es.toString());
		es.setExpression("3 * 5");
		es.solveExpression();
		System.out.println(es.toString());
		es.setExpression("3 - 5");
		es.solveExpression();
		System.out.println(es.toString());
		es.setExpression("3 / 5");
		es.solveExpression();
		System.out.println(es.toString());
		es.setExpression("5 / 5 * 2 + 8 / 2 + 5");
		es.solveExpression();
		System.out.println(es.toString());
		es.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 – 2");
		es.solveExpression();
		System.out.println(es.toString());
		
		
		
		

	}
}