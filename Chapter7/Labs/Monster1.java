package Chapter7.Labs;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Monster1 implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster1() {
		myWeight = 0;
		myHeight = 0;
		myAge = 0;
	}


	//write an initialization constructor with an int parameter ht
	public Monster1(int ht) {
		myWeight = 0;
		myHeight = ht;
		myAge = 0;
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster1(int ht, int wt) {
		myWeight = wt;
		myHeight = ht;
		myAge = 0;
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public Monster1(int ht, int wt, int age) {
		myWeight = wt;
		myHeight = ht;
		myAge = age;
	}


	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht) {
		myHeight = ht;
	}
	public void setWeight(int wt) {
		myWeight= wt;
	}
	public void setAge(int age) {
		myAge = age;
	}
	
	
	//accessors - write get methods for height, weight, and age
	public int getHeight() {
		return myHeight;
	}
	public int getWeight() {
		return myWeight;
	}
	public int getAge() {
		return myAge;
	}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster1(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		if (myHeight == ((Monster1)obj).getHeight() && myWeight == ((Monster1)obj).getWeight() && myAge == ((Monster1)obj).getAge()) {
			return true;
		} else {
			return false;
		}
	}

	public int compareTo( Object obj )
	{
		Monster1 rhs = (Monster1)obj;
		if (myHeight != rhs.getHeight()) {
			return ((Integer)myHeight).compareTo(rhs.getHeight());
		} else if (myWeight != ((Monster1)rhs).getWeight()) {
			return ((Integer)myWeight).compareTo(rhs.getWeight());
		} else if (myAge != rhs.getAge()) {
			return ((Integer)myAge).compareTo(rhs.getAge());
		} else {
			return 0;
		}
	}

	//write a toString() method
	public String toString() {
		return ("Height: " + myHeight + "\tWeight: " + myWeight + "\tAge: " + myAge);
	}
	
}