//********************************************************************
//  Dog.java       Author: Lewis/Loftus/Cocking
//
//  Represents a dog, which is a pet.
//********************************************************************

public class Dog extends Pet
{
   private int weight;

   //-----------------------------------------------------------------
   // Creates a dog with the given name and weight.
   //-----------------------------------------------------------------
   public Dog(String dogName, int dogWeight)
   {
      super(dogName);
      weight = dogWeight;
   }

   //-----------------------------------------------------------------
   // Returns this dog's weight.
   //-----------------------------------------------------------------
   public int getWeight()
   {
      return weight;
   }

   //-----------------------------------------------------------------
   // Returns a string representation of this dog.
   //-----------------------------------------------------------------
   public String toString()
   {
      return super.toString() + " is a dog, weighing " + weight + " pounds";
   }

   //-----------------------------------------------------------------
   // Returns a string indicating what this dog says.
   //-----------------------------------------------------------------
   public String speak()
   {
      return "woof";
   }

   //-----------------------------------------------------------------
   // Returns a string indicating how this dog moves.
   //-----------------------------------------------------------------
   public String move()
   {
      return "run";
   }
}
