//********************************************************************
//  Pet.java       Author: Lewis/Loftus/Cocking
//
//  Represents a pet.
//********************************************************************

public abstract class Pet
{
   private String name;

   //-----------------------------------------------------------------
   //  Creates a pet with the given name.
   //-----------------------------------------------------------------
   public Pet(String petName)
   {
      name = petName;
   }

   //-----------------------------------------------------------------
   //  Returns this pet's name.
   //-----------------------------------------------------------------
   public String getName()
   {
      return name;
   }

   //-----------------------------------------------------------------
   // Returns a string representation of this pet.
   //-----------------------------------------------------------------
   public String toString()
   {
      return "pet " + name;
   }

   //-----------------------------------------------------------------
   // This method should return a string indicating what this pet says.
   //-----------------------------------------------------------------
   abstract public String speak();

   //-----------------------------------------------------------------
   // This method should return a string indicating how this pet moves.
   //-----------------------------------------------------------------
   abstract public String move();
}
