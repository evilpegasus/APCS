package Labs;

import java.util.Scanner;

public class FractionCalculator{
    public static void main(String args[]) {
        int n1;
        int d1;
        int n2;
        int d2;
        String operation;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter numerator of first fraction: ");
        n1 = scan.nextInt();
        System.out.println("Enter denominator of first fraction: ");
        d1 = scan.nextInt();
        System.out.println("Enter numerator of second fraction: ");
        n2 = scan.nextInt();
        System.out.println("Enter denominator of second fraction: ");
        d2 = scan.nextInt();
        System.out.println("Enter operation(add, subtract, multiply, divide): ");
        operation = scan.next();

        Rational r1 = new Rational(n1,d1);
        Rational r2 = new Rational(n2,d2);
        Rational result;

        switch(operation){
            case "add":
            result = Rational.add(r1,r2);
            break;
            case "subtract":
            result = Rational.subtract(r1,r2);
            break;
            case "multiply":
            result = Rational.multiply(r1,r2);
            break;
            case "divide":
            result = Rational.divide(r1,r2);
            break;
            default:
            throw new IllegalArgumentException("Error: Operation not recognized");
        }
        System.out.println(result.num + " / " + result.den);
    }
}