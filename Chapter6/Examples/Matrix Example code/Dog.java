//(c) A+ Computer Science
// www.apluscompsci.com

public class Dog
{
  private int age;
  private String name;
	
  public Dog( String n, int a )  {
    age = a;
    name = n;
  }
	
  public int getAge()    {
    return age;
  }
	
  public String getName()    {
     return name;
  }
	
  public String toString()    {
    return "" + name + " " + age;
  }
}
