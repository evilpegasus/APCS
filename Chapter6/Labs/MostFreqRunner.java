//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;

public class MostFreqRunner {
	public static void main( String args[] ) {
		ArrayList<Integer> a = new ArrayList<Integer>(
			Arrays.asList(-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5));
		ArrayList<Integer> b = new ArrayList<Integer>(
			Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		ArrayList<Integer> c = new ArrayList<Integer>(
			Arrays.asList(10,20,30,40,50,10,10,40,30,20,10));
		ArrayList<Integer> d = new ArrayList<Integer>(
			Arrays.asList(32767));
		ArrayList<Integer> e = new ArrayList<Integer>(
			Arrays.asList(255,255));
		ArrayList<Integer> f = new ArrayList<Integer>(
			Arrays.asList(9,10,-88,100,-555,1000));
		ArrayList<Integer> g = new ArrayList<Integer>(
			Arrays.asList(10,10,10,11,456,10,10,2,2,2,2,2,2,2));
		ArrayList<Integer> h = new ArrayList<Integer>(
			Arrays.asList(-111,1,2,3,9,11,20,30));
		ArrayList<Integer> i = new ArrayList<Integer>(
			Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
		ArrayList<Integer> j = new ArrayList<Integer>(
			Arrays.asList(12,12,15,18,21,23,1000));
		ArrayList<Integer> k = new ArrayList<Integer>(
			Arrays.asList(250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1));
		ArrayList<Integer> l = new ArrayList<Integer>(
			Arrays.asList(9,10,-8,10000,-5000,1000));
		System.out.println(ListMostFreq.go(a));
		System.out.println(ListMostFreq.go(b));
		System.out.println(ListMostFreq.go(c));
		System.out.println(ListMostFreq.go(d));
		System.out.println(ListMostFreq.go(e));
		System.out.println(ListMostFreq.go(f));
		System.out.println(ListMostFreq.go(g));
		System.out.println(ListMostFreq.go(h));
		System.out.println(ListMostFreq.go(i));
		System.out.println(ListMostFreq.go(j));
		System.out.println(ListMostFreq.go(k));
		System.out.println(ListMostFreq.go(l));
	}
}