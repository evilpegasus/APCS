// **********************************************************************
//   ChangingPeople.java
//
//   Demonstrates parameter passing -- contains a method that should
//   change to Person objects.
// **********************************************************************

public class ChangingPeople
{
    // ---------------------------------------------------------
    //  Sets up two person objects, one integer, and one String
    //  object.  These are sent to a method that should make
    //  some changes.
    // ---------------------------------------------------------
    public static void main (String[] args)
    {
	Person person1 = new Person ("Sally", 13);
	Person person2 = new Person ("Sam", 15);

	int age = 21;
	String name = "Jill";

	System.out.println ("\nParameter Passing... Original values...");
	System.out.println ("person1: " + person1);
	System.out.println ("person2: " + person2);
	System.out.println ("age: " + age + "\tname: " + name + "\n");

	changePeople (person1, person2, age, name);

	System.out.println ("\nValues after calling changePeople...");
	System.out.println ("person1: " + person1);
	System.out.println ("person2: " + person2);
	System.out.println ("age: " + age + "\tname: " + name + "\n");
    }

    // -------------------------------------------------------------------
    //  Change the first actual parameter to "Jack - Age 101" and change 
    //  the second actual parameter to be a person with the age and
    //  name given in the third and fourth parameters.
    // -------------------------------------------------------------------
    public static void changePeople (Person p1, Person p2, int age, String name)
    {
	System.out.println ("\nInside changePeople... Original parameters...");
	System.out.println ("person1: " + p1);
	System.out.println ("person2: " + p2);
	System.out.println ("age: " + age + "\tname: " + name + "\n");
	// Make changes
	p2.changeName(name);
	p2.changeAge(age);

	name = "Jack";
	age = 101;
	p1.changeName (name);
	p1.changeAge (age);

	// Print changes
	System.out.println ("\nInside changePeople... Changed values...");
	System.out.println ("person1: " + p1);
	System.out.println ("person2: " + p2);
	System.out.println ("age: " + age + "\tname: " + name + "\n");
    }
}