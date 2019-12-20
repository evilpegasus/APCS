public class PenguinPopulation
{

public static void main(String[] args)
	{
Penguin p1 = new Penguin("Billy", 13, 7);
Penguin p2 = new Penguin();


System.out.print(Penguin.getLargestPenguinSize());

if (p1.compareTo(p2) > 0)
{
  System.out.println(p1.toString() + ", was the largest Penguin, then " + p2.toString());
}
else if (p1.compareTo(p2) < 0)
{
  System.out.println(p2.toString() + ", was the largest Penguin, then " + p1.toString());
}
else
{
  System.out.println("The two penguins have the same size and swim speed.");
}
}
}