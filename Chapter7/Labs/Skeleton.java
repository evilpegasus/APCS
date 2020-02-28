package Chapter7.Labs;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{

	
	//add instance variables	
	int size;
	String name;
	//add a constructor
	public Skeleton(int s, String n) {
		size = s;
		name = n;
	}
	//add code to implement the Monster interface
	public int getHowBig() {
		return size;
	}

	public String getName() {
		return name;
	}

	public boolean isBigger(Monster other) {
		return (size > other.getHowBig());
	}

	public boolean isSmaller(Monster other) {
		return (size < other.getHowBig());
	}

	public boolean namesTheSame(Monster other) {
		return (name.equals(other.getName()));
	}
	//add a toString
	public String toString() {
		return "Name: " + name + ", Size: " + size;
	}
}